import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  tareas: any[] = [];
  //objeto tarea, para agregar la nueva
  tarea = {
    id: null,
    nombre: '',
    realizado: false,
  };
  constructor(private appService: AppService) {}
  getAll() {
    this.appService.getAll().subscribe((data: any) => (this.tareas = data));
  }

  ngOnInit(): void {
    this.getAll();
  }
  save() {
    if (this.tarea.id) {
      this.appService.update(this.tarea.id, this.tarea).subscribe(() =>
        //cargar nuevamente las tareas)
        this.getAll()
      );
    } else {
      this.appService.create(this.tarea).subscribe(() =>
        //cargar nuevamente las tareas)
        this.getAll()
      );
    }
    this.tarea = {
      id: null,
      nombre: '',
      realizado: false,
    };
  }
  edit(tarea: any) {
    this.tarea = {
      ...tarea,
    };
  }
  delete(tarea: any){
this.appService.delete(tarea.id).subscribe(()=>this.getAll())
  }
}
