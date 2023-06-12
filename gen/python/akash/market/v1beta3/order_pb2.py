# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/market/v1beta3/order.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.deployment.v1beta3 import groupspec_pb2 as akash_dot_deployment_dot_v1beta3_dot_groupspec__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n akash/market/v1beta3/order.proto\x12\x14\x61kash.market.v1beta3\x1a\x14gogoproto/gogo.proto\x1a(akash/deployment/v1beta3/groupspec.proto\"\xe3\x01\n\x07OrderID\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x33\n\x04\x64seq\x18\x02 \x01(\x04\x42\x1f\xe2\xde\x1f\x04\x44Seq\xea\xde\x1f\x04\x64seq\xf2\xde\x1f\x0byaml:\"dseq\"R\x04\x64seq\x12\x33\n\x04gseq\x18\x03 \x01(\rB\x1f\xe2\xde\x1f\x04GSeq\xea\xde\x1f\x04gseq\xf2\xde\x1f\x0byaml:\"gseq\"R\x04gseq\x12\x33\n\x04oseq\x18\x04 \x01(\rB\x1f\xe2\xde\x1f\x04OSeq\xea\xde\x1f\x04oseq\xf2\xde\x1f\x0byaml:\"oseq\"R\x04oseq:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xbf\x03\n\x05Order\x12\\\n\x08order_id\x18\x01 \x01(\x0b\x32\x1d.akash.market.v1beta3.OrderIDB\"\xc8\xde\x1f\x00\xe2\xde\x1f\x07OrderID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x07orderId\x12R\n\x05state\x18\x02 \x01(\x0e\x32!.akash.market.v1beta3.Order.StateB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12T\n\x04spec\x18\x03 \x01(\x0b\x32#.akash.deployment.v1beta3.GroupSpecB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04spec\xf2\xde\x1f\x0byaml:\"spec\"R\x04spec\x12\x1d\n\ncreated_at\x18\x04 \x01(\x03R\tcreatedAt\"\x84\x01\n\x05State\x12\"\n\x07invalid\x10\x00\x1a\x15\x8a\x9d \x11OrderStateInvalid\x12\x17\n\x04open\x10\x01\x1a\r\x8a\x9d \tOrderOpen\x12\x1b\n\x06\x61\x63tive\x10\x02\x1a\x0f\x8a\x9d \x0bOrderActive\x12\x1b\n\x06\x63losed\x10\x03\x1a\x0f\x8a\x9d \x0bOrderClosed\x1a\x04\x88\xa3\x1e\x00:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x95\x02\n\x0cOrderFilters\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x33\n\x04\x64seq\x18\x02 \x01(\x04\x42\x1f\xe2\xde\x1f\x04\x44Seq\xea\xde\x1f\x04\x64seq\xf2\xde\x1f\x0byaml:\"dseq\"R\x04\x64seq\x12\x33\n\x04gseq\x18\x03 \x01(\rB\x1f\xe2\xde\x1f\x04GSeq\xea\xde\x1f\x04gseq\xf2\xde\x1f\x0byaml:\"gseq\"R\x04gseq\x12\x33\n\x04oseq\x18\x04 \x01(\rB\x1f\xe2\xde\x1f\x04OSeq\xea\xde\x1f\x04oseq\xf2\xde\x1f\x0byaml:\"oseq\"R\x04oseq\x12/\n\x05state\x18\x05 \x01(\tB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state:\x04\xe8\xa0\x1f\x00\x42\xd3\x01\n\x18\x63om.akash.market.v1beta3B\nOrderProtoP\x01Z9github.com/akash-network/akash-api/go/node/market/v1beta3\xa2\x02\x03\x41MX\xaa\x02\x14\x41kash.Market.V1beta3\xca\x02\x14\x41kash\\Market\\V1beta3\xe2\x02 Akash\\Market\\V1beta3\\GPBMetadata\xea\x02\x16\x41kash::Market::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.market.v1beta3.order_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.akash.market.v1beta3B\nOrderProtoP\001Z9github.com/akash-network/akash-api/go/node/market/v1beta3\242\002\003AMX\252\002\024Akash.Market.V1beta3\312\002\024Akash\\Market\\V1beta3\342\002 Akash\\Market\\V1beta3\\GPBMetadata\352\002\026Akash::Market::V1beta3'
  _ORDERID.fields_by_name['owner']._options = None
  _ORDERID.fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _ORDERID.fields_by_name['dseq']._options = None
  _ORDERID.fields_by_name['dseq']._serialized_options = b'\342\336\037\004DSeq\352\336\037\004dseq\362\336\037\013yaml:\"dseq\"'
  _ORDERID.fields_by_name['gseq']._options = None
  _ORDERID.fields_by_name['gseq']._serialized_options = b'\342\336\037\004GSeq\352\336\037\004gseq\362\336\037\013yaml:\"gseq\"'
  _ORDERID.fields_by_name['oseq']._options = None
  _ORDERID.fields_by_name['oseq']._serialized_options = b'\342\336\037\004OSeq\352\336\037\004oseq\362\336\037\013yaml:\"oseq\"'
  _ORDERID._options = None
  _ORDERID._serialized_options = b'\230\240\037\000\350\240\037\000'
  _ORDER_STATE._options = None
  _ORDER_STATE._serialized_options = b'\210\243\036\000'
  _ORDER_STATE.values_by_name["invalid"]._options = None
  _ORDER_STATE.values_by_name["invalid"]._serialized_options = b'\212\235 \021OrderStateInvalid'
  _ORDER_STATE.values_by_name["open"]._options = None
  _ORDER_STATE.values_by_name["open"]._serialized_options = b'\212\235 \tOrderOpen'
  _ORDER_STATE.values_by_name["active"]._options = None
  _ORDER_STATE.values_by_name["active"]._serialized_options = b'\212\235 \013OrderActive'
  _ORDER_STATE.values_by_name["closed"]._options = None
  _ORDER_STATE.values_by_name["closed"]._serialized_options = b'\212\235 \013OrderClosed'
  _ORDER.fields_by_name['order_id']._options = None
  _ORDER.fields_by_name['order_id']._serialized_options = b'\310\336\037\000\342\336\037\007OrderID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _ORDER.fields_by_name['state']._options = None
  _ORDER.fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _ORDER.fields_by_name['spec']._options = None
  _ORDER.fields_by_name['spec']._serialized_options = b'\310\336\037\000\352\336\037\004spec\362\336\037\013yaml:\"spec\"'
  _ORDER._options = None
  _ORDER._serialized_options = b'\230\240\037\000\350\240\037\000'
  _ORDERFILTERS.fields_by_name['owner']._options = None
  _ORDERFILTERS.fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _ORDERFILTERS.fields_by_name['dseq']._options = None
  _ORDERFILTERS.fields_by_name['dseq']._serialized_options = b'\342\336\037\004DSeq\352\336\037\004dseq\362\336\037\013yaml:\"dseq\"'
  _ORDERFILTERS.fields_by_name['gseq']._options = None
  _ORDERFILTERS.fields_by_name['gseq']._serialized_options = b'\342\336\037\004GSeq\352\336\037\004gseq\362\336\037\013yaml:\"gseq\"'
  _ORDERFILTERS.fields_by_name['oseq']._options = None
  _ORDERFILTERS.fields_by_name['oseq']._serialized_options = b'\342\336\037\004OSeq\352\336\037\004oseq\362\336\037\013yaml:\"oseq\"'
  _ORDERFILTERS.fields_by_name['state']._options = None
  _ORDERFILTERS.fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _ORDERFILTERS._options = None
  _ORDERFILTERS._serialized_options = b'\350\240\037\000'
  _globals['_ORDERID']._serialized_start=123
  _globals['_ORDERID']._serialized_end=350
  _globals['_ORDER']._serialized_start=353
  _globals['_ORDER']._serialized_end=800
  _globals['_ORDER_STATE']._serialized_start=658
  _globals['_ORDER_STATE']._serialized_end=790
  _globals['_ORDERFILTERS']._serialized_start=803
  _globals['_ORDERFILTERS']._serialized_end=1080
# @@protoc_insertion_point(module_scope)
