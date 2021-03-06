using Microsoft.EntityFrameworkCore;

namespace _19_dotnetcore_postgres.Models
{
    public class UniversityDBContext : DbContext
    {
        public DbSet<StudentEntity> Students { get; set; }
        
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
            => optionsBuilder.UseNpgsql("Host=localhost;Database=postgres;Username=postgres;Password=123456");
    }
}