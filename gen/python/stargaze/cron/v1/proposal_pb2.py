# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stargaze/cron/v1/proposal.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fstargaze/cron/v1/proposal.proto\x12\x1epublicawesome.stargaze.cron.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xd8\x01\n#PromoteToPrivilegedContractProposal\x12&\n\x05title\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"title\"R\x05title\x12\x38\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12/\n\x08\x63ontract\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"contract\"R\x08\x63ontract:\x1e\xca\xb4-\x1a\x63osmos.gov.v1beta1.Content\"\xd5\x01\n DemotePrivilegedContractProposal\x12&\n\x05title\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"title\"R\x05title\x12\x38\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12/\n\x08\x63ontract\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"contract\"R\x08\x63ontract:\x1e\xca\xb4-\x1a\x63osmos.gov.v1beta1.ContentB\x83\x02\n\"com.publicawesome.stargaze.cron.v1B\rProposalProtoP\x01Z3github.com/public-awesome/stargaze/v11/x/cron/types\xa2\x02\x03PSC\xaa\x02\x1ePublicawesome.Stargaze.Cron.V1\xca\x02\x1ePublicawesome\\Stargaze\\Cron\\V1\xe2\x02*Publicawesome\\Stargaze\\Cron\\V1\\GPBMetadata\xea\x02!Publicawesome::Stargaze::Cron::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stargaze.cron.v1.proposal_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.publicawesome.stargaze.cron.v1B\rProposalProtoP\001Z3github.com/public-awesome/stargaze/v11/x/cron/types\242\002\003PSC\252\002\036Publicawesome.Stargaze.Cron.V1\312\002\036Publicawesome\\Stargaze\\Cron\\V1\342\002*Publicawesome\\Stargaze\\Cron\\V1\\GPBMetadata\352\002!Publicawesome::Stargaze::Cron::V1'
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['title']._options = None
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['title']._serialized_options = b'\362\336\037\014yaml:\"title\"'
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['description']._options = None
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['contract']._options = None
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['contract']._serialized_options = b'\362\336\037\017yaml:\"contract\"'
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL._options = None
  _PROMOTETOPRIVILEGEDCONTRACTPROPOSAL._serialized_options = b'\312\264-\032cosmos.gov.v1beta1.Content'
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['title']._options = None
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['title']._serialized_options = b'\362\336\037\014yaml:\"title\"'
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['description']._options = None
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['contract']._options = None
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL.fields_by_name['contract']._serialized_options = b'\362\336\037\017yaml:\"contract\"'
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL._options = None
  _DEMOTEPRIVILEGEDCONTRACTPROPOSAL._serialized_options = b'\312\264-\032cosmos.gov.v1beta1.Content'
  _globals['_PROMOTETOPRIVILEGEDCONTRACTPROPOSAL']._serialized_start=117
  _globals['_PROMOTETOPRIVILEGEDCONTRACTPROPOSAL']._serialized_end=333
  _globals['_DEMOTEPRIVILEGEDCONTRACTPROPOSAL']._serialized_start=336
  _globals['_DEMOTEPRIVILEGEDCONTRACTPROPOSAL']._serialized_end=549
# @@protoc_insertion_point(module_scope)