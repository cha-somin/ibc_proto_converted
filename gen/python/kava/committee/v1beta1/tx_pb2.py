# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/committee/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from kava.committee.v1beta1 import genesis_pb2 as kava_dot_committee_dot_v1beta1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fkava/committee/v1beta1/tx.proto\x12\x16kava.committee.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a$kava/committee/v1beta1/genesis.proto\"\xbc\x01\n\x11MsgSubmitProposal\x12W\n\x0cpub_proposal\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyB\x1e\xca\xb4-\x1a\x63osmos.gov.v1beta1.ContentR\x0bpubProposal\x12\x1a\n\x08proposer\x18\x02 \x01(\tR\x08proposer\x12\x32\n\x0c\x63ommittee_id\x18\x03 \x01(\x04\x42\x0f\xe2\xde\x1f\x0b\x43ommitteeIDR\x0b\x63ommitteeId\"L\n\x19MsgSubmitProposalResponse\x12/\n\x0bproposal_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nProposalIDR\nproposalId\"\x8f\x01\n\x07MsgVote\x12/\n\x0bproposal_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nProposalIDR\nproposalId\x12\x14\n\x05voter\x18\x02 \x01(\tR\x05voter\x12=\n\tvote_type\x18\x03 \x01(\x0e\x32 .kava.committee.v1beta1.VoteTypeR\x08voteType\"\x11\n\x0fMsgVoteResponse2\xc7\x01\n\x03Msg\x12n\n\x0eSubmitProposal\x12).kava.committee.v1beta1.MsgSubmitProposal\x1a\x31.kava.committee.v1beta1.MsgSubmitProposalResponse\x12P\n\x04Vote\x12\x1f.kava.committee.v1beta1.MsgVote\x1a\'.kava.committee.v1beta1.MsgVoteResponseB\xd0\x01\n\x1a\x63om.kava.committee.v1beta1B\x07TxProtoP\x01Z+github.com/kava-labs/kava/x/committee/types\xa2\x02\x03KCX\xaa\x02\x16Kava.Committee.V1beta1\xca\x02\x16Kava\\Committee\\V1beta1\xe2\x02\"Kava\\Committee\\V1beta1\\GPBMetadata\xea\x02\x18Kava::Committee::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.committee.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.kava.committee.v1beta1B\007TxProtoP\001Z+github.com/kava-labs/kava/x/committee/types\242\002\003KCX\252\002\026Kava.Committee.V1beta1\312\002\026Kava\\Committee\\V1beta1\342\002\"Kava\\Committee\\V1beta1\\GPBMetadata\352\002\030Kava::Committee::V1beta1\310\341\036\000'
  _MSGSUBMITPROPOSAL.fields_by_name['pub_proposal']._options = None
  _MSGSUBMITPROPOSAL.fields_by_name['pub_proposal']._serialized_options = b'\312\264-\032cosmos.gov.v1beta1.Content'
  _MSGSUBMITPROPOSAL.fields_by_name['committee_id']._options = None
  _MSGSUBMITPROPOSAL.fields_by_name['committee_id']._serialized_options = b'\342\336\037\013CommitteeID'
  _MSGSUBMITPROPOSALRESPONSE.fields_by_name['proposal_id']._options = None
  _MSGSUBMITPROPOSALRESPONSE.fields_by_name['proposal_id']._serialized_options = b'\342\336\037\nProposalID'
  _MSGVOTE.fields_by_name['proposal_id']._options = None
  _MSGVOTE.fields_by_name['proposal_id']._serialized_options = b'\342\336\037\nProposalID'
  _globals['_MSGSUBMITPROPOSAL']._serialized_start=174
  _globals['_MSGSUBMITPROPOSAL']._serialized_end=362
  _globals['_MSGSUBMITPROPOSALRESPONSE']._serialized_start=364
  _globals['_MSGSUBMITPROPOSALRESPONSE']._serialized_end=440
  _globals['_MSGVOTE']._serialized_start=443
  _globals['_MSGVOTE']._serialized_end=586
  _globals['_MSGVOTERESPONSE']._serialized_start=588
  _globals['_MSGVOTERESPONSE']._serialized_end=605
  _globals['_MSG']._serialized_start=608
  _globals['_MSG']._serialized_end=807
# @@protoc_insertion_point(module_scope)
