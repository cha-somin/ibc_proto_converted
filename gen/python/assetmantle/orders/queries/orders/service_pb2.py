# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/orders/queries/orders/service.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from assetmantle.orders.queries.orders import query_request_pb2 as assetmantle_dot_orders_dot_queries_dot_orders_dot_query__request__pb2
from assetmantle.orders.queries.orders import query_response_pb2 as assetmantle_dot_orders_dot_queries_dot_orders_dot_query__response__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/assetmantle/orders/queries/orders/service.proto\x12)assetmantle.modules.orders.queries.orders\x1a\x1cgoogle/api/annotations.proto\x1a\x35\x61ssetmantle/orders/queries/orders/query_request.proto\x1a\x36\x61ssetmantle/orders/queries/orders/query_response.proto2\xae\x01\n\x07Service\x12\xa2\x01\n\x06Handle\x12\x37.assetmantle.modules.orders.queries.orders.QueryRequest\x1a\x38.assetmantle.modules.orders.queries.orders.QueryResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/mantle/orders/v1beta1/ordersB\x87\x02\n-com.assetmantle.modules.orders.queries.ordersB\x0cServiceProtoP\x01\xa2\x02\x05\x41MOQO\xaa\x02)Assetmantle.Modules.Orders.Queries.Orders\xca\x02)Assetmantle\\Modules\\Orders\\Queries\\Orders\xe2\x02\x35\x41ssetmantle\\Modules\\Orders\\Queries\\Orders\\GPBMetadata\xea\x02-Assetmantle::Modules::Orders::Queries::Ordersb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.orders.queries.orders.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n-com.assetmantle.modules.orders.queries.ordersB\014ServiceProtoP\001\242\002\005AMOQO\252\002)Assetmantle.Modules.Orders.Queries.Orders\312\002)Assetmantle\\Modules\\Orders\\Queries\\Orders\342\0025Assetmantle\\Modules\\Orders\\Queries\\Orders\\GPBMetadata\352\002-Assetmantle::Modules::Orders::Queries::Orders'
  _SERVICE.methods_by_name['Handle']._options = None
  _SERVICE.methods_by_name['Handle']._serialized_options = b'\202\323\344\223\002\037\022\035/mantle/orders/v1beta1/orders'
  _globals['_SERVICE']._serialized_start=236
  _globals['_SERVICE']._serialized_end=410
# @@protoc_insertion_point(module_scope)
