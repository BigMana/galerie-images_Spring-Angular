import { Component } from '@angular/core';

@Component({
  selector: 'app-galerie-images',
  templateUrl: './galerie-images.component.html',
  styleUrls: ['./galerie-images.component.css']
})
export class GalerieImagesComponent {
  imageUrl!: string;
  imageAlt!: string;
  imageDescription!: string;
  imageDate!: Date;
  imageLocation!: string;

  ngOnInit() {
    this.imageUrl ="img/tamatoa.jpg";
    this.imageAlt = "Tamatoa le Crabe";
    this.imageDescription = "Tamatoa le Crabe";
    this.imageDate = new Date(2024, 3, 24);
    this.imageLocation = "La Seyne Sur Mer";
  }
}
