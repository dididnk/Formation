# Créer un projet .Net

- dotnet new classlib -o CQRS.Core
- dotnet new sln
- dotnet new webapi -o Post.Cmd.Api
- dotnet classlib -o Post.Cmd.Domain
- dotnet classlib -o Post.Cmd.Infrastructure

## Combiner les deux dossiers dans la solution

- dotnet sln add ..\CQRS-ES\CQRS.Core\CQRS.Core.csproj
- dotnet sln add .\Post.Cmd\Post.Cmd.Api\Post.Cmd.Api.csproj (+ Domain et Infra aussi pour Query)