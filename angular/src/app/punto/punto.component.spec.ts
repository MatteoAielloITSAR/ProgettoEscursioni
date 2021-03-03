import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PuntoComponent } from './punto.component';

describe('PuntoComponent', () => {
  let component: PuntoComponent;
  let fixture: ComponentFixture<PuntoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PuntoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PuntoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
