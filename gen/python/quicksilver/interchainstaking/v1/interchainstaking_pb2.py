# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/interchainstaking/v1/interchainstaking.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8quicksilver/interchainstaking/v1/interchainstaking.proto\x12 quicksilver.interchainstaking.v1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xe6\x0c\n\x04Zone\x12#\n\rconnection_id\x18\x01 \x01(\tR\x0c\x63onnectionId\x12\x19\n\x08\x63hain_id\x18\x02 \x01(\tR\x07\x63hainId\x12U\n\x0f\x64\x65posit_address\x18\x03 \x01(\x0b\x32,.quicksilver.interchainstaking.v1.ICAAccountR\x0e\x64\x65positAddress\x12[\n\x12withdrawal_address\x18\x04 \x01(\x0b\x32,.quicksilver.interchainstaking.v1.ICAAccountR\x11withdrawalAddress\x12]\n\x13performance_address\x18\x05 \x01(\x0b\x32,.quicksilver.interchainstaking.v1.ICAAccountR\x12performanceAddress\x12[\n\x12\x64\x65legation_address\x18\x06 \x01(\x0b\x32,.quicksilver.interchainstaking.v1.ICAAccountR\x11\x64\x65legationAddress\x12%\n\x0e\x61\x63\x63ount_prefix\x18\x07 \x01(\tR\raccountPrefix\x12\x1f\n\x0blocal_denom\x18\x08 \x01(\tR\nlocalDenom\x12\x1d\n\nbase_denom\x18\t \x01(\tR\tbaseDenom\x12\x65\n\x0fredemption_rate\x18\n \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0eredemptionRate\x12n\n\x14last_redemption_rate\x18\x0b \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x12lastRedemptionRate\x12K\n\nvalidators\x18\x0c \x03(\x0b\x32+.quicksilver.interchainstaking.v1.ValidatorR\nvalidators\x12r\n\x10\x61ggregate_intent\x18\r \x03(\x0b\x32\x31.quicksilver.interchainstaking.v1.ValidatorIntentB\x14\xaa\xdf\x1f\x10ValidatorIntentsR\x0f\x61ggregateIntent\x12\x1d\n\nmulti_send\x18\x0e \x01(\x08R\tmultiSend\x12)\n\x10liquidity_module\x18\x0f \x01(\x08R\x0fliquidityModule\x12\x31\n\x14withdrawal_waitgroup\x18\x10 \x01(\rR\x13withdrawalWaitgroup\x12\x37\n\x18ibc_next_validators_hash\x18\x11 \x01(\x0cR\x15ibcNextValidatorsHash\x12\x44\n\x1evalidator_selection_allocation\x18\x12 \x01(\x04R\x1cvalidatorSelectionAllocation\x12/\n\x13holdings_allocation\x18\x13 \x01(\x04R\x12holdingsAllocation\x12*\n\x11last_epoch_height\x18\x14 \x01(\x03R\x0flastEpochHeight\x12N\n\x03tvl\x18\x15 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x03tvl\x12)\n\x10unbonding_period\x18\x16 \x01(\x03R\x0funbondingPeriod\x12&\n\x0fmessages_per_tx\x18\x17 \x01(\x03R\rmessagesPerTx\x12\x1a\n\x08\x64\x65\x63imals\x18\x18 \x01(\x03R\x08\x64\x65\x63imals\x12+\n\x11unbonding_enabled\x18\x19 \x01(\x08R\x10unbondingEnabled\x12)\n\x10\x64\x65posits_enabled\x18\x1a \x01(\x08R\x0f\x64\x65positsEnabled\x12(\n\x10return_to_sender\x18\x1b \x01(\x08R\x0ereturnToSender\x12\x15\n\x06is_118\x18\x1c \x01(\x08R\x05is118\"\xa0\x02\n\nICAAccount\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x65\n\x07\x62\x61lance\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x07\x62\x61lance\x12\x1b\n\tport_name\x18\x03 \x01(\tR\x08portName\x12-\n\x12withdrawal_address\x18\x04 \x01(\tR\x11withdrawalAddress\x12+\n\x11\x62\x61lance_waitgroup\x18\x05 \x01(\rR\x10\x62\x61lanceWaitgroup\"@\n\x0c\x44istribution\x12\x18\n\x07valoper\x18\x01 \x01(\tR\x07valoper\x12\x16\n\x06\x61mount\x18\x02 \x01(\x04R\x06\x61mount\"\xed\x04\n\x10WithdrawalRecord\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12\x36\n\tdelegator\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tdelegator\x12R\n\x0c\x64istribution\x18\x03 \x03(\x0b\x32..quicksilver.interchainstaking.v1.DistributionR\x0c\x64istribution\x12\x36\n\trecipient\x18\x04 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\trecipient\x12\x63\n\x06\x61mount\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12z\n\x0b\x62urn_amount\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB>\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.Coin\xd2\xb4-\x0b\x63osmos.CoinR\nburnAmount\x12\x16\n\x06txhash\x18\x07 \x01(\tR\x06txhash\x12\x16\n\x06status\x18\x08 \x01(\x05R\x06status\x12M\n\x0f\x63ompletion_time\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x0e\x63ompletionTime\x12\x1a\n\x08requeued\x18\n \x01(\x08R\x08requeued\"\xae\x01\n\x0fUnbondingRecord\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12!\n\x0c\x65poch_number\x18\x02 \x01(\x03R\x0b\x65pochNumber\x12\x36\n\tvalidator\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tvalidator\x12%\n\x0erelated_txhash\x18\x04 \x03(\tR\rrelatedTxhash\"\xa7\x02\n\x12RedelegationRecord\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12!\n\x0c\x65poch_number\x18\x02 \x01(\x03R\x0b\x65pochNumber\x12\x30\n\x06source\x18\x03 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06source\x12:\n\x0b\x64\x65stination\x18\x04 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0b\x64\x65stination\x12\x16\n\x06\x61mount\x18\x05 \x01(\x03R\x06\x61mount\x12M\n\x0f\x63ompletion_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x0e\x63ompletionTime\"\xed\x01\n\x0eTransferRecord\x12\x30\n\x06sender\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06sender\x12\x36\n\trecipient\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\trecipient\x12q\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB>\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.Coin\xd2\xb4-\x0b\x63osmos.CoinR\x06\x61mount\"\xec\x04\n\tValidator\x12\x41\n\x0fvaloper_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0evaloperAddress\x12\x65\n\x0f\x63ommission_rate\x18\x02 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0e\x63ommissionRate\x12g\n\x10\x64\x65legator_shares\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0f\x64\x65legatorShares\x12_\n\x0cvoting_power\x18\x04 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0bvotingPower\x12R\n\x05score\x18\x05 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x05score\x12\x16\n\x06status\x18\x06 \x01(\tR\x06status\x12\x16\n\x06jailed\x18\x07 \x01(\x08R\x06jailed\x12\x1e\n\ntombstoned\x18\x08 \x01(\x08R\ntombstoned\x12G\n\x0cjailed_since\x18\t \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x0bjailedSince\"\xac\x01\n\x0f\x44\x65legatorIntent\x12\x36\n\tdelegator\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tdelegator\x12\x61\n\x07intents\x18\x02 \x03(\x0b\x32\x31.quicksilver.interchainstaking.v1.ValidatorIntentB\x14\xaa\xdf\x1f\x10ValidatorIntentsR\x07intents\"\xbc\x01\n\x0fValidatorIntent\x12\x42\n\x0fvaloper_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0fvaloper_address\x12\x65\n\x06weight\x18\x02 \x01(\tBM\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\ryaml:\"weight\"\xd2\xb4-\ncosmos.DecR\x06weight\"\xd2\x02\n\nDelegation\x12G\n\x12\x64\x65legation_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x11\x64\x65legationAddress\x12\x45\n\x11validator_address\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x10validatorAddress\x12q\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB>\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.Coin\xd2\xb4-\x0b\x63osmos.CoinR\x06\x61mount\x12\x16\n\x06height\x18\x04 \x01(\x03R\x06height\x12)\n\x10redelegation_end\x18\x05 \x01(\x03R\x0fredelegationEnd\"S\n\x13PortConnectionTuple\x12#\n\rconnection_id\x18\x01 \x01(\tR\x0c\x63onnectionId\x12\x17\n\x07port_id\x18\x02 \x01(\tR\x06portId\"\xdc\x02\n\x07Receipt\x12\x19\n\x08\x63hain_id\x18\x01 \x01(\tR\x07\x63hainId\x12\x30\n\x06sender\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06sender\x12\x16\n\x06txhash\x18\x03 \x01(\tR\x06txhash\x12\x63\n\x06\x61mount\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12\x43\n\nfirst_seen\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x01\x90\xdf\x1f\x01R\tfirstSeen\x12\x42\n\tcompleted\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x01\x90\xdf\x1f\x01R\tcompletedB\xa2\x02\n$com.quicksilver.interchainstaking.v1B\x16InterchainstakingProtoP\x01Z@github.com/ingenuity-build/quicksilver/x/interchainstaking/types\xa2\x02\x03QIX\xaa\x02 Quicksilver.Interchainstaking.V1\xca\x02 Quicksilver\\Interchainstaking\\V1\xe2\x02,Quicksilver\\Interchainstaking\\V1\\GPBMetadata\xea\x02\"Quicksilver::Interchainstaking::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.interchainstaking.v1.interchainstaking_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n$com.quicksilver.interchainstaking.v1B\026InterchainstakingProtoP\001Z@github.com/ingenuity-build/quicksilver/x/interchainstaking/types\242\002\003QIX\252\002 Quicksilver.Interchainstaking.V1\312\002 Quicksilver\\Interchainstaking\\V1\342\002,Quicksilver\\Interchainstaking\\V1\\GPBMetadata\352\002\"Quicksilver::Interchainstaking::V1'
  _ZONE.fields_by_name['redemption_rate']._options = None
  _ZONE.fields_by_name['redemption_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _ZONE.fields_by_name['last_redemption_rate']._options = None
  _ZONE.fields_by_name['last_redemption_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _ZONE.fields_by_name['aggregate_intent']._options = None
  _ZONE.fields_by_name['aggregate_intent']._serialized_options = b'\252\337\037\020ValidatorIntents'
  _ZONE.fields_by_name['tvl']._options = None
  _ZONE.fields_by_name['tvl']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _ICAACCOUNT.fields_by_name['address']._options = None
  _ICAACCOUNT.fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _ICAACCOUNT.fields_by_name['balance']._options = None
  _ICAACCOUNT.fields_by_name['balance']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _WITHDRAWALRECORD.fields_by_name['delegator']._options = None
  _WITHDRAWALRECORD.fields_by_name['delegator']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _WITHDRAWALRECORD.fields_by_name['recipient']._options = None
  _WITHDRAWALRECORD.fields_by_name['recipient']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _WITHDRAWALRECORD.fields_by_name['amount']._options = None
  _WITHDRAWALRECORD.fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _WITHDRAWALRECORD.fields_by_name['burn_amount']._options = None
  _WITHDRAWALRECORD.fields_by_name['burn_amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin\322\264-\013cosmos.Coin'
  _WITHDRAWALRECORD.fields_by_name['completion_time']._options = None
  _WITHDRAWALRECORD.fields_by_name['completion_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _UNBONDINGRECORD.fields_by_name['validator']._options = None
  _UNBONDINGRECORD.fields_by_name['validator']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _REDELEGATIONRECORD.fields_by_name['source']._options = None
  _REDELEGATIONRECORD.fields_by_name['source']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _REDELEGATIONRECORD.fields_by_name['destination']._options = None
  _REDELEGATIONRECORD.fields_by_name['destination']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _REDELEGATIONRECORD.fields_by_name['completion_time']._options = None
  _REDELEGATIONRECORD.fields_by_name['completion_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _TRANSFERRECORD.fields_by_name['sender']._options = None
  _TRANSFERRECORD.fields_by_name['sender']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _TRANSFERRECORD.fields_by_name['recipient']._options = None
  _TRANSFERRECORD.fields_by_name['recipient']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _TRANSFERRECORD.fields_by_name['amount']._options = None
  _TRANSFERRECORD.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin\322\264-\013cosmos.Coin'
  _VALIDATOR.fields_by_name['valoper_address']._options = None
  _VALIDATOR.fields_by_name['valoper_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _VALIDATOR.fields_by_name['commission_rate']._options = None
  _VALIDATOR.fields_by_name['commission_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _VALIDATOR.fields_by_name['delegator_shares']._options = None
  _VALIDATOR.fields_by_name['delegator_shares']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _VALIDATOR.fields_by_name['voting_power']._options = None
  _VALIDATOR.fields_by_name['voting_power']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _VALIDATOR.fields_by_name['score']._options = None
  _VALIDATOR.fields_by_name['score']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _VALIDATOR.fields_by_name['jailed_since']._options = None
  _VALIDATOR.fields_by_name['jailed_since']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _DELEGATORINTENT.fields_by_name['delegator']._options = None
  _DELEGATORINTENT.fields_by_name['delegator']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _DELEGATORINTENT.fields_by_name['intents']._options = None
  _DELEGATORINTENT.fields_by_name['intents']._serialized_options = b'\252\337\037\020ValidatorIntents'
  _VALIDATORINTENT.fields_by_name['valoper_address']._options = None
  _VALIDATORINTENT.fields_by_name['valoper_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _VALIDATORINTENT.fields_by_name['weight']._options = None
  _VALIDATORINTENT.fields_by_name['weight']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\ryaml:\"weight\"\322\264-\ncosmos.Dec'
  _DELEGATION.fields_by_name['delegation_address']._options = None
  _DELEGATION.fields_by_name['delegation_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _DELEGATION.fields_by_name['validator_address']._options = None
  _DELEGATION.fields_by_name['validator_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _DELEGATION.fields_by_name['amount']._options = None
  _DELEGATION.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin\322\264-\013cosmos.Coin'
  _RECEIPT.fields_by_name['sender']._options = None
  _RECEIPT.fields_by_name['sender']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _RECEIPT.fields_by_name['amount']._options = None
  _RECEIPT.fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _RECEIPT.fields_by_name['first_seen']._options = None
  _RECEIPT.fields_by_name['first_seen']._serialized_options = b'\310\336\037\001\220\337\037\001'
  _RECEIPT.fields_by_name['completed']._options = None
  _RECEIPT.fields_by_name['completed']._serialized_options = b'\310\336\037\001\220\337\037\001'
  _globals['_ZONE']._serialized_start=209
  _globals['_ZONE']._serialized_end=1847
  _globals['_ICAACCOUNT']._serialized_start=1850
  _globals['_ICAACCOUNT']._serialized_end=2138
  _globals['_DISTRIBUTION']._serialized_start=2140
  _globals['_DISTRIBUTION']._serialized_end=2204
  _globals['_WITHDRAWALRECORD']._serialized_start=2207
  _globals['_WITHDRAWALRECORD']._serialized_end=2828
  _globals['_UNBONDINGRECORD']._serialized_start=2831
  _globals['_UNBONDINGRECORD']._serialized_end=3005
  _globals['_REDELEGATIONRECORD']._serialized_start=3008
  _globals['_REDELEGATIONRECORD']._serialized_end=3303
  _globals['_TRANSFERRECORD']._serialized_start=3306
  _globals['_TRANSFERRECORD']._serialized_end=3543
  _globals['_VALIDATOR']._serialized_start=3546
  _globals['_VALIDATOR']._serialized_end=4166
  _globals['_DELEGATORINTENT']._serialized_start=4169
  _globals['_DELEGATORINTENT']._serialized_end=4341
  _globals['_VALIDATORINTENT']._serialized_start=4344
  _globals['_VALIDATORINTENT']._serialized_end=4532
  _globals['_DELEGATION']._serialized_start=4535
  _globals['_DELEGATION']._serialized_end=4873
  _globals['_PORTCONNECTIONTUPLE']._serialized_start=4875
  _globals['_PORTCONNECTIONTUPLE']._serialized_end=4958
  _globals['_RECEIPT']._serialized_start=4961
  _globals['_RECEIPT']._serialized_end=5309
# @@protoc_insertion_point(module_scope)
