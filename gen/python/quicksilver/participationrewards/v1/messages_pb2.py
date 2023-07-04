# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/participationrewards/v1/messages.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from tendermint.crypto import proof_pb2 as tendermint_dot_crypto_dot_proof__pb2
from quicksilver.participationrewards.v1 import participationrewards_pb2 as quicksilver_dot_participationrewards_dot_v1_dot_participationrewards__pb2
from quicksilver.claimsmanager.v1 import claimsmanager_pb2 as quicksilver_dot_claimsmanager_dot_v1_dot_claimsmanager__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2quicksilver/participationrewards/v1/messages.proto\x12#quicksilver.participationrewards.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1dtendermint/crypto/proof.proto\x1a>quicksilver/participationrewards/v1/participationrewards.proto\x1a\x30quicksilver/claimsmanager/v1/claimsmanager.proto\"\x8e\x02\n\x0eMsgSubmitClaim\x12<\n\x0cuser_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0cuser_address\x12\x12\n\x04zone\x18\x02 \x01(\tR\x04zone\x12\x1a\n\x08src_zone\x18\x03 \x01(\tR\x08src_zone\x12G\n\nclaim_type\x18\x04 \x01(\x0e\x32\'.quicksilver.claimsmanager.v1.ClaimTypeR\nclaim_type\x12;\n\x06proofs\x18\x05 \x03(\x0b\x32#.quicksilver.claimsmanager.v1.ProofR\x06proofs:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x18\n\x16MsgSubmitClaimResponse2\xc1\x01\n\x03Msg\x12\xb9\x01\n\x0bSubmitClaim\x12\x33.quicksilver.participationrewards.v1.MsgSubmitClaim\x1a;.quicksilver.participationrewards.v1.MsgSubmitClaimResponse\"8\x82\xd3\xe4\x93\x02\x32\"-/quicksilver/tx/v1/participationrewards/claim:\x01*B\xab\x02\n\'com.quicksilver.participationrewards.v1B\rMessagesProtoP\x01ZCgithub.com/ingenuity-build/quicksilver/x/participationrewards/types\xa2\x02\x03QPX\xaa\x02#Quicksilver.Participationrewards.V1\xca\x02#Quicksilver\\Participationrewards\\V1\xe2\x02/Quicksilver\\Participationrewards\\V1\\GPBMetadata\xea\x02%Quicksilver::Participationrewards::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.participationrewards.v1.messages_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\'com.quicksilver.participationrewards.v1B\rMessagesProtoP\001ZCgithub.com/ingenuity-build/quicksilver/x/participationrewards/types\242\002\003QPX\252\002#Quicksilver.Participationrewards.V1\312\002#Quicksilver\\Participationrewards\\V1\342\002/Quicksilver\\Participationrewards\\V1\\GPBMetadata\352\002%Quicksilver::Participationrewards::V1'
  _MSGSUBMITCLAIM.fields_by_name['user_address']._options = None
  _MSGSUBMITCLAIM.fields_by_name['user_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGSUBMITCLAIM._options = None
  _MSGSUBMITCLAIM._serialized_options = b'\210\240\037\000\350\240\037\000'
  _MSG.methods_by_name['SubmitClaim']._options = None
  _MSG.methods_by_name['SubmitClaim']._serialized_options = b'\202\323\344\223\0022\"-/quicksilver/tx/v1/participationrewards/claim:\001*'
  _globals['_MSGSUBMITCLAIM']._serialized_start=316
  _globals['_MSGSUBMITCLAIM']._serialized_end=586
  _globals['_MSGSUBMITCLAIMRESPONSE']._serialized_start=588
  _globals['_MSGSUBMITCLAIMRESPONSE']._serialized_end=612
  _globals['_MSG']._serialized_start=615
  _globals['_MSG']._serialized_end=808
# @@protoc_insertion_point(module_scope)