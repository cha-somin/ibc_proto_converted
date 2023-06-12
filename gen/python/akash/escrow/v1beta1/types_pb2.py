# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/escrow/v1beta1/types.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n akash/escrow/v1beta1/types.proto\x12\x14\x61kash.escrow.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"l\n\tAccountID\x12/\n\x05scope\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05scope\xf2\xde\x1f\x0cyaml:\"scope\"R\x05scope\x12.\n\x03xid\x18\x02 \x01(\tB\x1c\xe2\xde\x1f\x03XID\xea\xde\x1f\x03xid\xf2\xde\x1f\nyaml:\"xid\"R\x03xid\"\x84\x05\n\x07\x41\x63\x63ount\x12N\n\x02id\x18\x01 \x01(\x0b\x32\x1f.akash.escrow.v1beta1.AccountIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12/\n\x05owner\x18\x02 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12T\n\x05state\x18\x03 \x01(\x0e\x32#.akash.escrow.v1beta1.Account.StateB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12V\n\x07\x62\x61lance\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB!\xc8\xde\x1f\x00\xea\xde\x1f\x07\x62\x61lance\xf2\xde\x1f\x0eyaml:\"balance\"R\x07\x62\x61lance\x12\x66\n\x0btransferred\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB)\xc8\xde\x1f\x00\xea\xde\x1f\x0btransferred\xf2\xde\x1f\x12yaml:\"transferred\"R\x0btransferred\x12M\n\nsettled_at\x18\x06 \x01(\x03\x42.\xe2\xde\x1f\tSettledAt\xea\xde\x1f\tsettledAt\xf2\xde\x1f\x10yaml:\"settledAt\"R\tsettledAt\"\x92\x01\n\x05State\x12$\n\x07invalid\x10\x00\x1a\x17\x8a\x9d \x13\x41\x63\x63ountStateInvalid\x12\x19\n\x04open\x10\x01\x1a\x0f\x8a\x9d \x0b\x41\x63\x63ountOpen\x12\x1d\n\x06\x63losed\x10\x02\x1a\x11\x8a\x9d \rAccountClosed\x12#\n\toverdrawn\x10\x03\x1a\x14\x8a\x9d \x10\x41\x63\x63ountOverdrawn\x1a\x04\x88\xa3\x1e\x00\"\xf2\x05\n\x07Payment\x12r\n\naccount_id\x18\x01 \x01(\x0b\x32\x1f.akash.escrow.v1beta1.AccountIDB2\xc8\xde\x1f\x00\xe2\xde\x1f\tAccountID\xea\xde\x1f\taccountID\xf2\xde\x1f\x10yaml:\"accountID\"R\taccountId\x12M\n\npayment_id\x18\x02 \x01(\tB.\xe2\xde\x1f\tPaymentID\xea\xde\x1f\tpaymentID\xf2\xde\x1f\x10yaml:\"paymentID\"R\tpaymentId\x12/\n\x05owner\x18\x03 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12T\n\x05state\x18\x04 \x01(\x0e\x32#.akash.escrow.v1beta1.Payment.StateB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12J\n\x04rate\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04rate\xf2\xde\x1f\x0byaml:\"rate\"R\x04rate\x12V\n\x07\x62\x61lance\x18\x06 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB!\xc8\xde\x1f\x00\xea\xde\x1f\x07\x62\x61lance\xf2\xde\x1f\x0eyaml:\"balance\"R\x07\x62\x61lance\x12^\n\twithdrawn\x18\x07 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB%\xc8\xde\x1f\x00\xea\xde\x1f\twithdrawn\xf2\xde\x1f\x10yaml:\"withdrawn\"R\twithdrawn\"\x92\x01\n\x05State\x12$\n\x07invalid\x10\x00\x1a\x17\x8a\x9d \x13PaymentStateInvalid\x12\x19\n\x04open\x10\x01\x1a\x0f\x8a\x9d \x0bPaymentOpen\x12\x1d\n\x06\x63losed\x10\x02\x1a\x11\x8a\x9d \rPaymentClosed\x12#\n\toverdrawn\x10\x03\x1a\x14\x8a\x9d \x10PaymentOverdrawn\x1a\x04\x88\xa3\x1e\x00:\x04\x98\xa0\x1f\x01\x42\xd3\x01\n\x18\x63om.akash.escrow.v1beta1B\nTypesProtoP\x01Z9github.com/akash-network/akash-api/go/node/escrow/v1beta1\xa2\x02\x03\x41\x45X\xaa\x02\x14\x41kash.Escrow.V1beta1\xca\x02\x14\x41kash\\Escrow\\V1beta1\xe2\x02 Akash\\Escrow\\V1beta1\\GPBMetadata\xea\x02\x16\x41kash::Escrow::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.escrow.v1beta1.types_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.akash.escrow.v1beta1B\nTypesProtoP\001Z9github.com/akash-network/akash-api/go/node/escrow/v1beta1\242\002\003AEX\252\002\024Akash.Escrow.V1beta1\312\002\024Akash\\Escrow\\V1beta1\342\002 Akash\\Escrow\\V1beta1\\GPBMetadata\352\002\026Akash::Escrow::V1beta1'
  _ACCOUNTID.fields_by_name['scope']._options = None
  _ACCOUNTID.fields_by_name['scope']._serialized_options = b'\352\336\037\005scope\362\336\037\014yaml:\"scope\"'
  _ACCOUNTID.fields_by_name['xid']._options = None
  _ACCOUNTID.fields_by_name['xid']._serialized_options = b'\342\336\037\003XID\352\336\037\003xid\362\336\037\nyaml:\"xid\"'
  _ACCOUNT_STATE._options = None
  _ACCOUNT_STATE._serialized_options = b'\210\243\036\000'
  _ACCOUNT_STATE.values_by_name["invalid"]._options = None
  _ACCOUNT_STATE.values_by_name["invalid"]._serialized_options = b'\212\235 \023AccountStateInvalid'
  _ACCOUNT_STATE.values_by_name["open"]._options = None
  _ACCOUNT_STATE.values_by_name["open"]._serialized_options = b'\212\235 \013AccountOpen'
  _ACCOUNT_STATE.values_by_name["closed"]._options = None
  _ACCOUNT_STATE.values_by_name["closed"]._serialized_options = b'\212\235 \rAccountClosed'
  _ACCOUNT_STATE.values_by_name["overdrawn"]._options = None
  _ACCOUNT_STATE.values_by_name["overdrawn"]._serialized_options = b'\212\235 \020AccountOverdrawn'
  _ACCOUNT.fields_by_name['id']._options = None
  _ACCOUNT.fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _ACCOUNT.fields_by_name['owner']._options = None
  _ACCOUNT.fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _ACCOUNT.fields_by_name['state']._options = None
  _ACCOUNT.fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _ACCOUNT.fields_by_name['balance']._options = None
  _ACCOUNT.fields_by_name['balance']._serialized_options = b'\310\336\037\000\352\336\037\007balance\362\336\037\016yaml:\"balance\"'
  _ACCOUNT.fields_by_name['transferred']._options = None
  _ACCOUNT.fields_by_name['transferred']._serialized_options = b'\310\336\037\000\352\336\037\013transferred\362\336\037\022yaml:\"transferred\"'
  _ACCOUNT.fields_by_name['settled_at']._options = None
  _ACCOUNT.fields_by_name['settled_at']._serialized_options = b'\342\336\037\tSettledAt\352\336\037\tsettledAt\362\336\037\020yaml:\"settledAt\"'
  _PAYMENT_STATE._options = None
  _PAYMENT_STATE._serialized_options = b'\210\243\036\000'
  _PAYMENT_STATE.values_by_name["invalid"]._options = None
  _PAYMENT_STATE.values_by_name["invalid"]._serialized_options = b'\212\235 \023PaymentStateInvalid'
  _PAYMENT_STATE.values_by_name["open"]._options = None
  _PAYMENT_STATE.values_by_name["open"]._serialized_options = b'\212\235 \013PaymentOpen'
  _PAYMENT_STATE.values_by_name["closed"]._options = None
  _PAYMENT_STATE.values_by_name["closed"]._serialized_options = b'\212\235 \rPaymentClosed'
  _PAYMENT_STATE.values_by_name["overdrawn"]._options = None
  _PAYMENT_STATE.values_by_name["overdrawn"]._serialized_options = b'\212\235 \020PaymentOverdrawn'
  _PAYMENT.fields_by_name['account_id']._options = None
  _PAYMENT.fields_by_name['account_id']._serialized_options = b'\310\336\037\000\342\336\037\tAccountID\352\336\037\taccountID\362\336\037\020yaml:\"accountID\"'
  _PAYMENT.fields_by_name['payment_id']._options = None
  _PAYMENT.fields_by_name['payment_id']._serialized_options = b'\342\336\037\tPaymentID\352\336\037\tpaymentID\362\336\037\020yaml:\"paymentID\"'
  _PAYMENT.fields_by_name['owner']._options = None
  _PAYMENT.fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _PAYMENT.fields_by_name['state']._options = None
  _PAYMENT.fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _PAYMENT.fields_by_name['rate']._options = None
  _PAYMENT.fields_by_name['rate']._serialized_options = b'\310\336\037\000\352\336\037\004rate\362\336\037\013yaml:\"rate\"'
  _PAYMENT.fields_by_name['balance']._options = None
  _PAYMENT.fields_by_name['balance']._serialized_options = b'\310\336\037\000\352\336\037\007balance\362\336\037\016yaml:\"balance\"'
  _PAYMENT.fields_by_name['withdrawn']._options = None
  _PAYMENT.fields_by_name['withdrawn']._serialized_options = b'\310\336\037\000\352\336\037\twithdrawn\362\336\037\020yaml:\"withdrawn\"'
  _PAYMENT._options = None
  _PAYMENT._serialized_options = b'\230\240\037\001'
  _globals['_ACCOUNTID']._serialized_start=112
  _globals['_ACCOUNTID']._serialized_end=220
  _globals['_ACCOUNT']._serialized_start=223
  _globals['_ACCOUNT']._serialized_end=867
  _globals['_ACCOUNT_STATE']._serialized_start=721
  _globals['_ACCOUNT_STATE']._serialized_end=867
  _globals['_PAYMENT']._serialized_start=870
  _globals['_PAYMENT']._serialized_end=1624
  _globals['_PAYMENT_STATE']._serialized_start=1472
  _globals['_PAYMENT_STATE']._serialized_end=1618
# @@protoc_insertion_point(module_scope)
