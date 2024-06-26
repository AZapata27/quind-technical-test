package dev.andreszapata.bankfuse.infrastructure.db.springdata.mapper;

import dev.andreszapata.bankfuse.domain.model.Transaction;
import dev.andreszapata.bankfuse.infrastructure.db.springdata.entity.TransactionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        uses = {TransactionMapper.class})
public interface TransactionMapper {

    Transaction entityToDomain(TransactionEntity transactionEntity);

    TransactionEntity domainToEntity(Transaction domain);
}
