import { Component, OnInit } from '@angular/core';
import {Usuarios} from './usuarios';
import {UsuariosService} from './usuarios.service';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  usuarios: Usuarios[];
  

  constructor(private usuariosService: UsuariosService) { }

  ngOnInit(): void {
      this.getUsuarios();
  }

  // tslint:disable-next-line:typedef
  private getUsuarios() {
      this.usuariosService.getUsuarios().subscribe(data => {
          this.usuarios = data;
      });
  }

}
