# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: bitsong/fantoken/v1beta1/events.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%bitsong/fantoken/v1beta1/events.proto\x12\x18\x62itsong.fantoken.v1beta1\x1a\x14gogoproto/gogo.proto\"\"\n\nEventIssue\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"(\n\x10\x45ventDisableMint\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\"=\n\tEventMint\x12\x1c\n\trecipient\x18\x01 \x01(\tR\trecipient\x12\x12\n\x04\x63oin\x18\x02 \x01(\tR\x04\x63oin\"7\n\tEventBurn\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x12\n\x04\x63oin\x18\x02 \x01(\tR\x04\x63oin\"\xa7\x01\n\x11\x45ventSetAuthority\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12=\n\rold_authority\x18\x02 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"old_authority\"R\x0coldAuthority\x12=\n\rnew_authority\x18\x03 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"new_authority\"R\x0cnewAuthority\"\x92\x01\n\x0e\x45ventSetMinter\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x34\n\nold_minter\x18\x02 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"old_minter\"R\toldMinter\x12\x34\n\nnew_minter\x18\x03 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"new_minter\"R\tnewMinter\"#\n\x0b\x45ventSetUri\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nomB\xe5\x01\n\x1c\x63om.bitsong.fantoken.v1beta1B\x0b\x45ventsProtoP\x01Z6github.com/bitsongofficial/go-bitsong/x/fantoken/types\xa2\x02\x03\x42\x46X\xaa\x02\x18\x42itsong.Fantoken.V1beta1\xca\x02\x18\x42itsong\\Fantoken\\V1beta1\xe2\x02$Bitsong\\Fantoken\\V1beta1\\GPBMetadata\xea\x02\x1a\x42itsong::Fantoken::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'bitsong.fantoken.v1beta1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.bitsong.fantoken.v1beta1B\013EventsProtoP\001Z6github.com/bitsongofficial/go-bitsong/x/fantoken/types\242\002\003BFX\252\002\030Bitsong.Fantoken.V1beta1\312\002\030Bitsong\\Fantoken\\V1beta1\342\002$Bitsong\\Fantoken\\V1beta1\\GPBMetadata\352\002\032Bitsong::Fantoken::V1beta1'
  _EVENTSETAUTHORITY.fields_by_name['old_authority']._options = None
  _EVENTSETAUTHORITY.fields_by_name['old_authority']._serialized_options = b'\362\336\037\024yaml:\"old_authority\"'
  _EVENTSETAUTHORITY.fields_by_name['new_authority']._options = None
  _EVENTSETAUTHORITY.fields_by_name['new_authority']._serialized_options = b'\362\336\037\024yaml:\"new_authority\"'
  _EVENTSETMINTER.fields_by_name['old_minter']._options = None
  _EVENTSETMINTER.fields_by_name['old_minter']._serialized_options = b'\362\336\037\021yaml:\"old_minter\"'
  _EVENTSETMINTER.fields_by_name['new_minter']._options = None
  _EVENTSETMINTER.fields_by_name['new_minter']._serialized_options = b'\362\336\037\021yaml:\"new_minter\"'
  _globals['_EVENTISSUE']._serialized_start=89
  _globals['_EVENTISSUE']._serialized_end=123
  _globals['_EVENTDISABLEMINT']._serialized_start=125
  _globals['_EVENTDISABLEMINT']._serialized_end=165
  _globals['_EVENTMINT']._serialized_start=167
  _globals['_EVENTMINT']._serialized_end=228
  _globals['_EVENTBURN']._serialized_start=230
  _globals['_EVENTBURN']._serialized_end=285
  _globals['_EVENTSETAUTHORITY']._serialized_start=288
  _globals['_EVENTSETAUTHORITY']._serialized_end=455
  _globals['_EVENTSETMINTER']._serialized_start=458
  _globals['_EVENTSETMINTER']._serialized_end=604
  _globals['_EVENTSETURI']._serialized_start=606
  _globals['_EVENTSETURI']._serialized_end=641
# @@protoc_insertion_point(module_scope)