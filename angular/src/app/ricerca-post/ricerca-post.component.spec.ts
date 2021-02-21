import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RicercaPostComponent } from './ricerca-post.component';

describe('RicercaPostComponent', () => {
  let component: RicercaPostComponent;
  let fixture: ComponentFixture<RicercaPostComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RicercaPostComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RicercaPostComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
