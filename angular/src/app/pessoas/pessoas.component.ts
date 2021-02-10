import { Component, OnInit } from '@angular/core';
import {Pessoas} from './pessoas';
import {PessoasService} from './pessoas.service';

@Component({
  selector: 'app-pessoas',
  templateUrl: './pessoas.component.html',
  styleUrls: ['./pessoas.component.css']
})
export class PessoasComponent implements OnInit {

  pessoas: Pessoas[];

  constructor(private pessoasService: PessoasService) { }

  ngOnInit(): void {
      this.getPessoas();
  }

  // tslint:disable-next-line:typedef
  private getPessoas() {
      this.pessoasService.getPessoas().subscribe(data => {
          this.pessoas = data;
      });
  }

}
