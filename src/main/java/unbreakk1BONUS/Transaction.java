﻿package unbreakk1BONUS;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transaction(BigDecimal amount, BigDecimal balance, String description, LocalDateTime date)
{
}
