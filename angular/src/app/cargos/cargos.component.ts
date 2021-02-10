import { Component, OnInit } from '@angular/core';
import {Cargos} from './cargos';
import {CargosService} from './cargos.service';

@Component({
  selector: 'app-cargos',
  templateUrl: './cargos.component.html',
  styleUrls: ['./cargos.component.css']
})
export class CargosComponent implements OnInit {

  cargos: Cargos[];

  constructor(private cargosService: CargosService) { }

  ngOnInit(): void {
      this.getCargos();
  }

  // tslint:disable-next-line:typedef
  private getCargos() {
      this.cargosService.getCargos().subscribe(data => {
          this.cargos = data;
      });
  }

}
