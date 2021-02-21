import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostIscrizioniComponent } from './post-iscrizioni.component';

describe('PostIscrizioniComponent', () => {
  let component: PostIscrizioniComponent;
  let fixture: ComponentFixture<PostIscrizioniComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostIscrizioniComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PostIscrizioniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
