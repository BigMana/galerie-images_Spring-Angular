import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GalerieImagesComponent } from './galerie-images.component';

describe('GalerieImagesComponent', () => {
  let component: GalerieImagesComponent;
  let fixture: ComponentFixture<GalerieImagesComponent>;

  
  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GalerieImagesComponent]
    });
    fixture = TestBed.createComponent(GalerieImagesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
