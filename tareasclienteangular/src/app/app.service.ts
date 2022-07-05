import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const API_BASE = 'http://localhost:8080/api';

@Injectable({
  providedIn: 'root',
})
export class AppService {
  constructor(private http: HttpClient) {}
  getAll() {
    return this.http.get(`${API_BASE}/tareas`);
  }
  create(tarea: any) {
    return this.http.post(`${API_BASE}/new`, tarea);
  }
  update(id: number, tarea: any) {
    return this.http.put(`${API_BASE}/${id}`, tarea);
  }
  delete(id: number) {
    return this.http.delete(`${API_BASE}/${id}`);
  }
}
