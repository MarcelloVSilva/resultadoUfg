<html>

<head>
	<%@ include file="header.html" %>
		<title>Resultado final</title>
</head>

<body>
	<form class="form-horizontal" method="post" action="resultado">
		<fieldset>
			<div class="form-group">
				<div class="row">
					<label for="nome" class="col-lg-2 control-label">Nome</label>
					<div class="col-lg-6">
						<input type="text" class="form-control" name="nome" value="${param.nome}" placeholder="Nome do aluno">
					</div>
				</div>
				<div class="row">

					<label for="frequencia" class="col-lg-2 control-label">Frequencia</label>
					<div class="col-lg-6">
						<input type="number" step="any" class="form-control" name="frequencia" value="${param.frequencia}" placeholder="Frequencia do aluno em porcentagem (sem %)">
					</div>
				</div>
				<div class="row">
					<label for="nota" class="col-lg-2 control-label">Nota final</label>
					<div class="col-lg-6">
						<input type="number" step="any" class="form-control" name="nota" value="${param.nota}" placeholder="Nota final do aluno">
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-10 col-lg-offset-2">
						<button type="submit" class="btn btn-primary">Calcular</button>
					</div>
				</div>
		</fieldset>
	</form>
	<b>${nome}-${resultadoFinal}</b>
</body>

</html>