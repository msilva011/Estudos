velocidade_max = int(input('Qual a velocidade maxima da via? '))
velocidade_usuario = int(input('Qual a velocidade que andou? '))
tolerancia = velocidade_max + velocidade_max*0.1
levou_multa = False

if velocidade_usuario <= velocidade_max:
  print('\n Você não levou multa')
elif velocidade_usuario > velocidade_max and velocidade_usuario <= tolerancia:
  print('\n Você passou na tolerancia para nao receber multa')
elif velocidade_usuario > tolerancia:
  levou_multa=True
  if velocidade_usuario == tolerancia+1:
    print('\n Multa Leve')
  elif velocidade_usuario >= tolerancia+2 and velocidade_usuario <= tolerancia+10:
    print('\n Multa Grave')
  else:
    print('\n Multa Gravissima')
  