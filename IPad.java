import java.util.Objects;

/**
 * @author Margaryta Lvova
 * @author Walter Chu
 * @version 1.0
 */
public class IPad extends IDevice
{
    private static final String purposeIPad = "learning";

    private String  purpose;
    private boolean hasCase;
    private String  operatingSystemVersion;

    public IPad(final String  purpose,
                final boolean hasCase,
                final String  operatingSystemVersion)
    {
        super(purpose);
        this.setPurpose(purposeIPad);

        this.purpose                = "learning";
        this.hasCase                = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    @Override
    public String getPurpose()
    {
        return purpose;
    }

    public boolean isHasCase()
    {
        return hasCase;
    }

    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }

    @Override
    public void setPurpose(final String purpose)
    {
        this.purpose = purpose;
    }

    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    @Override
    public void printDetails()
    {

    }

    @Override
    public String toString()
    {
        return "IPad{" +
           "purpose='" + purpose + '\'' +
           ", hasCase=" + hasCase +
           ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
           ", purpose='" + purpose + '\'' +
           "} " + super.toString();
    }

    @Override
    public boolean equals(final Object o)
    {
        if(this == o)
        {
            return true;
        }

        if(o == null)
        {
            return false;
        }

        if(!(o instanceof final IPad that))
        {
            return false;
        }

        return Objects.equals(operatingSystemVersion, that.operatingSystemVersion);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystemVersion);
    }
}
