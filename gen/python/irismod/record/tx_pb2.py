# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/record/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from irismod.record import record_pb2 as irismod_dot_record_dot_record__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17irismod/record/tx.proto\x12\x0eirismod.record\x1a\x1birismod/record/record.proto\x1a\x14gogoproto/gogo.proto\"l\n\x0fMsgCreateRecord\x12\x39\n\x08\x63ontents\x18\x01 \x03(\x0b\x32\x17.irismod.record.ContentB\x04\xc8\xde\x1f\x00R\x08\x63ontents\x12\x18\n\x07\x63reator\x18\x02 \x01(\tR\x07\x63reator:\x04\xe8\xa0\x1f\x01\")\n\x17MsgCreateRecordResponse\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id2_\n\x03Msg\x12X\n\x0c\x43reateRecord\x12\x1f.irismod.record.MsgCreateRecord\x1a\'.irismod.record.MsgCreateRecordResponseB\xab\x01\n\x12\x63om.irismod.recordB\x07TxProtoP\x01Z/github.com/irisnet/irismod/modules/record/types\xa2\x02\x03IRX\xaa\x02\x0eIrismod.Record\xca\x02\x0eIrismod\\Record\xe2\x02\x1aIrismod\\Record\\GPBMetadata\xea\x02\x0fIrismod::Record\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.record.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.irismod.recordB\007TxProtoP\001Z/github.com/irisnet/irismod/modules/record/types\242\002\003IRX\252\002\016Irismod.Record\312\002\016Irismod\\Record\342\002\032Irismod\\Record\\GPBMetadata\352\002\017Irismod::Record\310\341\036\000'
  _MSGCREATERECORD.fields_by_name['contents']._options = None
  _MSGCREATERECORD.fields_by_name['contents']._serialized_options = b'\310\336\037\000'
  _MSGCREATERECORD._options = None
  _MSGCREATERECORD._serialized_options = b'\350\240\037\001'
  _globals['_MSGCREATERECORD']._serialized_start=94
  _globals['_MSGCREATERECORD']._serialized_end=202
  _globals['_MSGCREATERECORDRESPONSE']._serialized_start=204
  _globals['_MSGCREATERECORDRESPONSE']._serialized_end=245
  _globals['_MSG']._serialized_start=247
  _globals['_MSG']._serialized_end=342
# @@protoc_insertion_point(module_scope)
