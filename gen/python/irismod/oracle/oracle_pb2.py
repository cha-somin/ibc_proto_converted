# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/oracle/oracle.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1birismod/oracle/oracle.proto\x12\x0eirismod.oracle\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x9e\x03\n\x04\x46\x65\x65\x64\x12\x31\n\tfeed_name\x18\x01 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"feed_name\"R\x08\x66\x65\x65\x64Name\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12@\n\x0e\x61ggregate_func\x18\x03 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"aggregate_func\"R\raggregateFunc\x12\x42\n\x0fvalue_json_path\x18\x04 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"value_json_path\"R\rvalueJsonPath\x12@\n\x0elatest_history\x18\x05 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"latest_history\"R\rlatestHistory\x12_\n\x12request_context_id\x18\x06 \x01(\tB1\xe2\xde\x1f\x10RequestContextID\xf2\xde\x1f\x19yaml:\"request_context_id\"R\x10requestContextId\x12\x18\n\x07\x63reator\x18\x07 \x01(\tR\x07\x63reator\"c\n\tFeedValue\x12\x12\n\x04\x64\x61ta\x18\x01 \x01(\tR\x04\x64\x61ta\x12\x42\n\ttimestamp\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\ttimestampB\xab\x01\n\x12\x63om.irismod.oracleB\x0bOracleProtoP\x01Z/github.com/irisnet/irismod/modules/oracle/types\xa2\x02\x03IOX\xaa\x02\x0eIrismod.Oracle\xca\x02\x0eIrismod\\Oracle\xe2\x02\x1aIrismod\\Oracle\\GPBMetadata\xea\x02\x0fIrismod::Oracleb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.oracle.oracle_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.irismod.oracleB\013OracleProtoP\001Z/github.com/irisnet/irismod/modules/oracle/types\242\002\003IOX\252\002\016Irismod.Oracle\312\002\016Irismod\\Oracle\342\002\032Irismod\\Oracle\\GPBMetadata\352\002\017Irismod::Oracle'
  _FEED.fields_by_name['feed_name']._options = None
  _FEED.fields_by_name['feed_name']._serialized_options = b'\362\336\037\020yaml:\"feed_name\"'
  _FEED.fields_by_name['aggregate_func']._options = None
  _FEED.fields_by_name['aggregate_func']._serialized_options = b'\362\336\037\025yaml:\"aggregate_func\"'
  _FEED.fields_by_name['value_json_path']._options = None
  _FEED.fields_by_name['value_json_path']._serialized_options = b'\362\336\037\026yaml:\"value_json_path\"'
  _FEED.fields_by_name['latest_history']._options = None
  _FEED.fields_by_name['latest_history']._serialized_options = b'\362\336\037\025yaml:\"latest_history\"'
  _FEED.fields_by_name['request_context_id']._options = None
  _FEED.fields_by_name['request_context_id']._serialized_options = b'\342\336\037\020RequestContextID\362\336\037\031yaml:\"request_context_id\"'
  _FEEDVALUE.fields_by_name['timestamp']._options = None
  _FEEDVALUE.fields_by_name['timestamp']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_FEED']._serialized_start=103
  _globals['_FEED']._serialized_end=517
  _globals['_FEEDVALUE']._serialized_start=519
  _globals['_FEEDVALUE']._serialized_end=618
# @@protoc_insertion_point(module_scope)
