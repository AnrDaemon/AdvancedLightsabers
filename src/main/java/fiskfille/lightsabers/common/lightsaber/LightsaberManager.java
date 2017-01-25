package fiskfille.lightsabers.common.lightsaber;

import fiskfille.lightsabers.LightsaberAPI;

public class LightsaberManager
{
    public static Lightsaber lightsaberGraflex = new LightsaberGraflex();
    public static Lightsaber lightsaberRedeemer = new LightsaberRedeemer();
    public static Lightsaber lightsaberMauler = new LightsaberMauler();
    public static Lightsaber lightsaberProdigalSon = new LightsaberProdigalSon();
    public static Lightsaber lightsaberKnighted = new LightsaberKnighted();
    public static Lightsaber lightsaberVaidAncient = new LightsaberVaid("Ancient");
    public static Lightsaber lightsaberVaidModern = new LightsaberVaid("Modern");
    public static Lightsaber lightsaberDroideka = new LightsaberDroideka();
    public static Lightsaber lightsaberFulcrum = new LightsaberFulcrum();
    public static Lightsaber lightsaberJuggernaut = new LightsaberJuggernaut();
    public static Lightsaber lightsaberMechanical = new LightsaberMechanical();
    public static Lightsaber lightsaberMandalorian = new LightsaberMandalorian();
    public static Lightsaber lightsaberFury = new LightsaberFury();

    public static void register()
    {
        LightsaberAPI.registerLightsaber(lightsaberGraflex);
        LightsaberAPI.registerLightsaber(lightsaberRedeemer);
        LightsaberAPI.registerLightsaber(lightsaberMauler);
        LightsaberAPI.registerLightsaber(lightsaberProdigalSon);
        LightsaberAPI.registerLightsaber(lightsaberKnighted);
        LightsaberAPI.registerLightsaber(lightsaberVaidAncient);
        LightsaberAPI.registerLightsaber(lightsaberVaidModern);
        LightsaberAPI.registerLightsaber(lightsaberDroideka);
        LightsaberAPI.registerLightsaber(lightsaberFulcrum);
        LightsaberAPI.registerLightsaber(lightsaberJuggernaut);
        LightsaberAPI.registerLightsaber(lightsaberMechanical);
        LightsaberAPI.registerLightsaber(lightsaberMandalorian);
        LightsaberAPI.registerLightsaber(lightsaberFury);
    }
}
