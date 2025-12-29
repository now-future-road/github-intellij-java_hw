public class Solution12 {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;

        }

        @Override
        public String toString() {
            return String.format("Today: %s", this.getWeatherType());
        }


        public interface Weather {
            String getWeatherType();
        }


    }
}
