import com.google.gson.annotations.SerializedName;

public record Moneda(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result) {
}
