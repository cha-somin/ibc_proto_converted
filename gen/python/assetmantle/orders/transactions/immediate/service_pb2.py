# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/orders/transactions/immediate/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from assetmantle.orders.transactions.immediate import message_pb2 as assetmantle_dot_orders_dot_transactions_dot_immediate_dot_message__pb2
from assetmantle.orders.transactions.immediate import transaction_response_pb2 as assetmantle_dot_orders_dot_transactions_dot_immediate_dot_transaction__response__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7assetmantle/orders/transactions/immediate/service.proto\x12\x31\x61ssetmantle.modules.orders.transactions.immediate\x1a\x1cgoogle/api/annotations.proto\x1a\x37\x61ssetmantle/orders/transactions/immediate/message.proto\x1a\x44\x61ssetmantle/orders/transactions/immediate/transaction_response.proto2\xba\x01\n\x07Service\x12\xae\x01\n\x06Handle\x12:.assetmantle.modules.orders.transactions.immediate.Message\x1a\x46.assetmantle.modules.orders.transactions.immediate.TransactionResponse\" \x82\xd3\xe4\x93\x02\x1a\"\x18/mantle/orders/immediateB\xaf\x02\n5com.assetmantle.modules.orders.transactions.immediateB\x0cServiceProtoP\x01\xa2\x02\x05\x41MOTI\xaa\x02\x31\x41ssetmantle.Modules.Orders.Transactions.Immediate\xca\x02\x31\x41ssetmantle\\Modules\\Orders\\Transactions\\Immediate\xe2\x02=Assetmantle\\Modules\\Orders\\Transactions\\Immediate\\GPBMetadata\xea\x02\x35\x41ssetmantle::Modules::Orders::Transactions::Immediateb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.orders.transactions.immediate.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n5com.assetmantle.modules.orders.transactions.immediateB\014ServiceProtoP\001\242\002\005AMOTI\252\0021Assetmantle.Modules.Orders.Transactions.Immediate\312\0021Assetmantle\\Modules\\Orders\\Transactions\\Immediate\342\002=Assetmantle\\Modules\\Orders\\Transactions\\Immediate\\GPBMetadata\352\0025Assetmantle::Modules::Orders::Transactions::Immediate'
  _SERVICE.methods_by_name['Handle']._options = None
  _SERVICE.methods_by_name['Handle']._serialized_options = b'\202\323\344\223\002\032\"\030/mantle/orders/immediate'
  _globals['_SERVICE']._serialized_start=268
  _globals['_SERVICE']._serialized_end=454
# @@protoc_insertion_point(module_scope)