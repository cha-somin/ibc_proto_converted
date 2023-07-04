# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ixo/entity/v1beta1/entity.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from ixo.iid.v1beta1 import iid_pb2 as ixo_dot_iid_dot_v1beta1_dot_iid__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fixo/entity/v1beta1/entity.proto\x12\x12ixo.entity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19ixo/iid/v1beta1/iid.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x8e\x01\n\x06Params\x12.\n\x12nftContractAddress\x18\x01 \x01(\tR\x12nftContractAddress\x12,\n\x11nftContractMinter\x18\x02 \x01(\tR\x11nftContractMinter\x12&\n\x0e\x63reateSequence\x18\x03 \x01(\x04R\x0e\x63reateSequence\"\xb5\x03\n\x06\x45ntity\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12?\n\nstart_date\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\tstartDate\x12;\n\x08\x65nd_date\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x07\x65ndDate\x12\x16\n\x06status\x18\x05 \x01(\x05R\x06status\x12!\n\x0crelayer_node\x18\x06 \x01(\tR\x0brelayerNode\x12 \n\x0b\x63redentials\x18\x07 \x03(\tR\x0b\x63redentials\x12\'\n\x0f\x65ntity_verified\x18\x08 \x01(\x08R\x0e\x65ntityVerified\x12>\n\x08metadata\x18\t \x01(\x0b\x32\".ixo.entity.v1beta1.EntityMetadataR\x08metadata\x12=\n\x08\x61\x63\x63ounts\x18\n \x03(\x0b\x32!.ixo.entity.v1beta1.EntityAccountR\x08\x61\x63\x63ounts:\x04\xe8\xa0\x1f\x01\"C\n\rEntityAccount\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress:\x04\xe8\xa0\x1f\x01\"\xad\x01\n\x0e\x45ntityMetadata\x12\x1d\n\nversion_id\x18\x01 \x01(\tR\tversionId\x12:\n\x07\x63reated\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x07\x63reated\x12:\n\x07updated\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x07updated:\x04\xe8\xa0\x1f\x01\x42\xc7\x01\n\x16\x63om.ixo.entity.v1beta1B\x0b\x45ntityProtoP\x01Z6github.com/ixofoundation/ixo-blockchain/x/entity/types\xa2\x02\x03IEX\xaa\x02\x12Ixo.Entity.V1beta1\xca\x02\x12Ixo\\Entity\\V1beta1\xe2\x02\x1eIxo\\Entity\\V1beta1\\GPBMetadata\xea\x02\x14Ixo::Entity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ixo.entity.v1beta1.entity_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.ixo.entity.v1beta1B\013EntityProtoP\001Z6github.com/ixofoundation/ixo-blockchain/x/entity/types\242\002\003IEX\252\002\022Ixo.Entity.V1beta1\312\002\022Ixo\\Entity\\V1beta1\342\002\036Ixo\\Entity\\V1beta1\\GPBMetadata\352\002\024Ixo::Entity::V1beta1'
  _ENTITY.fields_by_name['start_date']._options = None
  _ENTITY.fields_by_name['start_date']._serialized_options = b'\220\337\037\001'
  _ENTITY.fields_by_name['end_date']._options = None
  _ENTITY.fields_by_name['end_date']._serialized_options = b'\220\337\037\001'
  _ENTITY._options = None
  _ENTITY._serialized_options = b'\350\240\037\001'
  _ENTITYACCOUNT._options = None
  _ENTITYACCOUNT._serialized_options = b'\350\240\037\001'
  _ENTITYMETADATA.fields_by_name['created']._options = None
  _ENTITYMETADATA.fields_by_name['created']._serialized_options = b'\220\337\037\001'
  _ENTITYMETADATA.fields_by_name['updated']._options = None
  _ENTITYMETADATA.fields_by_name['updated']._serialized_options = b'\220\337\037\001'
  _ENTITYMETADATA._options = None
  _ENTITYMETADATA._serialized_options = b'\350\240\037\001'
  _globals['_PARAMS']._serialized_start=138
  _globals['_PARAMS']._serialized_end=280
  _globals['_ENTITY']._serialized_start=283
  _globals['_ENTITY']._serialized_end=720
  _globals['_ENTITYACCOUNT']._serialized_start=722
  _globals['_ENTITYACCOUNT']._serialized_end=789
  _globals['_ENTITYMETADATA']._serialized_start=792
  _globals['_ENTITYMETADATA']._serialized_end=965
# @@protoc_insertion_point(module_scope)