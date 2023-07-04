# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: regen/group/v1alpha1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from regen.group.v1alpha1 import types_pb2 as regen_dot_group_dot_v1alpha1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dregen/group/v1alpha1/tx.proto\x12\x14regen.group.v1alpha1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x19google/protobuf/any.proto\x1a regen/group/v1alpha1/types.proto\"\x80\x01\n\x0eMsgCreateGroup\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12<\n\x07members\x18\x02 \x03(\x0b\x32\x1c.regen.group.v1alpha1.MemberB\x04\xc8\xde\x1f\x00R\x07members\x12\x1a\n\x08metadata\x18\x03 \x01(\x0cR\x08metadata\"3\n\x16MsgCreateGroupResponse\x12\x19\n\x08group_id\x18\x01 \x01(\x04R\x07groupId\"\x93\x01\n\x15MsgUpdateGroupMembers\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x19\n\x08group_id\x18\x02 \x01(\x04R\x07groupId\x12I\n\x0emember_updates\x18\x03 \x03(\x0b\x32\x1c.regen.group.v1alpha1.MemberB\x04\xc8\xde\x1f\x00R\rmemberUpdates\"\x1f\n\x1dMsgUpdateGroupMembersResponse\"c\n\x13MsgUpdateGroupAdmin\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x19\n\x08group_id\x18\x02 \x01(\x04R\x07groupId\x12\x1b\n\tnew_admin\x18\x03 \x01(\tR\x08newAdmin\"\x1d\n\x1bMsgUpdateGroupAdminResponse\"e\n\x16MsgUpdateGroupMetadata\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x19\n\x08group_id\x18\x02 \x01(\x04R\x07groupId\x12\x1a\n\x08metadata\x18\x03 \x01(\x0cR\x08metadata\" \n\x1eMsgUpdateGroupMetadataResponse\"\xbd\x01\n\x15MsgCreateGroupAccount\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x19\n\x08group_id\x18\x02 \x01(\x04R\x07groupId\x12\x1a\n\x08metadata\x18\x03 \x01(\x0cR\x08metadata\x12Q\n\x0f\x64\x65\x63ision_policy\x18\x04 \x01(\x0b\x32\x14.google.protobuf.AnyB\x12\xca\xb4-\x0e\x44\x65\x63isionPolicyR\x0e\x64\x65\x63isionPolicy:\x04\x88\xa0\x1f\x00\"9\n\x1dMsgCreateGroupAccountResponse\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"i\n\x1aMsgUpdateGroupAccountAdmin\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x1b\n\tnew_admin\x18\x03 \x01(\tR\x08newAdmin\"$\n\"MsgUpdateGroupAccountAdminResponse\"\xae\x01\n#MsgUpdateGroupAccountDecisionPolicy\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12Q\n\x0f\x64\x65\x63ision_policy\x18\x03 \x01(\x0b\x32\x14.google.protobuf.AnyB\x12\xca\xb4-\x0e\x44\x65\x63isionPolicyR\x0e\x64\x65\x63isionPolicy:\x04\x88\xa0\x1f\x00\"-\n+MsgUpdateGroupAccountDecisionPolicyResponse\"k\n\x1dMsgUpdateGroupAccountMetadata\x12\x14\n\x05\x61\x64min\x18\x01 \x01(\tR\x05\x61\x64min\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x1a\n\x08metadata\x18\x03 \x01(\x0cR\x08metadata\"\'\n%MsgUpdateGroupAccountMetadataResponse\"\xc7\x01\n\x11MsgCreateProposal\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x1c\n\tproposers\x18\x02 \x03(\tR\tproposers\x12\x1a\n\x08metadata\x18\x03 \x01(\x0cR\x08metadata\x12(\n\x04msgs\x18\x04 \x03(\x0b\x32\x14.google.protobuf.AnyR\x04msgs\x12.\n\x04\x65xec\x18\x05 \x01(\x0e\x32\x1a.regen.group.v1alpha1.ExecR\x04\x65xec:\x04\x88\xa0\x1f\x00\"<\n\x19MsgCreateProposalResponse\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\"\xc2\x01\n\x07MsgVote\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\x12\x14\n\x05voter\x18\x02 \x01(\tR\x05voter\x12\x34\n\x06\x63hoice\x18\x03 \x01(\x0e\x32\x1c.regen.group.v1alpha1.ChoiceR\x06\x63hoice\x12\x1a\n\x08metadata\x18\x04 \x01(\x0cR\x08metadata\x12.\n\x04\x65xec\x18\x05 \x01(\x0e\x32\x1a.regen.group.v1alpha1.ExecR\x04\x65xec\"\x11\n\x0fMsgVoteResponse\"B\n\x07MsgExec\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\x12\x16\n\x06signer\x18\x02 \x01(\tR\x06signer\"\x11\n\x0fMsgExecResponse**\n\x04\x45xec\x12\x14\n\x10\x45XEC_UNSPECIFIED\x10\x00\x12\x0c\n\x08\x45XEC_TRY\x10\x01\x32\x89\n\n\x03Msg\x12\x61\n\x0b\x43reateGroup\x12$.regen.group.v1alpha1.MsgCreateGroup\x1a,.regen.group.v1alpha1.MsgCreateGroupResponse\x12v\n\x12UpdateGroupMembers\x12+.regen.group.v1alpha1.MsgUpdateGroupMembers\x1a\x33.regen.group.v1alpha1.MsgUpdateGroupMembersResponse\x12p\n\x10UpdateGroupAdmin\x12).regen.group.v1alpha1.MsgUpdateGroupAdmin\x1a\x31.regen.group.v1alpha1.MsgUpdateGroupAdminResponse\x12y\n\x13UpdateGroupMetadata\x12,.regen.group.v1alpha1.MsgUpdateGroupMetadata\x1a\x34.regen.group.v1alpha1.MsgUpdateGroupMetadataResponse\x12v\n\x12\x43reateGroupAccount\x12+.regen.group.v1alpha1.MsgCreateGroupAccount\x1a\x33.regen.group.v1alpha1.MsgCreateGroupAccountResponse\x12\x85\x01\n\x17UpdateGroupAccountAdmin\x12\x30.regen.group.v1alpha1.MsgUpdateGroupAccountAdmin\x1a\x38.regen.group.v1alpha1.MsgUpdateGroupAccountAdminResponse\x12\xa0\x01\n UpdateGroupAccountDecisionPolicy\x12\x39.regen.group.v1alpha1.MsgUpdateGroupAccountDecisionPolicy\x1a\x41.regen.group.v1alpha1.MsgUpdateGroupAccountDecisionPolicyResponse\x12\x8e\x01\n\x1aUpdateGroupAccountMetadata\x12\x33.regen.group.v1alpha1.MsgUpdateGroupAccountMetadata\x1a;.regen.group.v1alpha1.MsgUpdateGroupAccountMetadataResponse\x12j\n\x0e\x43reateProposal\x12\'.regen.group.v1alpha1.MsgCreateProposal\x1a/.regen.group.v1alpha1.MsgCreateProposalResponse\x12L\n\x04Vote\x12\x1d.regen.group.v1alpha1.MsgVote\x1a%.regen.group.v1alpha1.MsgVoteResponse\x12L\n\x04\x45xec\x12\x1d.regen.group.v1alpha1.MsgExec\x1a%.regen.group.v1alpha1.MsgExecResponseB\xc4\x01\n\x18\x63om.regen.group.v1alpha1B\x07TxProtoP\x01Z-github.com/regen-network/regen-ledger/x/group\xa2\x02\x03RGX\xaa\x02\x14Regen.Group.V1alpha1\xca\x02\x14Regen\\Group\\V1alpha1\xe2\x02 Regen\\Group\\V1alpha1\\GPBMetadata\xea\x02\x16Regen::Group::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'regen.group.v1alpha1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.regen.group.v1alpha1B\007TxProtoP\001Z-github.com/regen-network/regen-ledger/x/group\242\002\003RGX\252\002\024Regen.Group.V1alpha1\312\002\024Regen\\Group\\V1alpha1\342\002 Regen\\Group\\V1alpha1\\GPBMetadata\352\002\026Regen::Group::V1alpha1'
  _MSGCREATEGROUP.fields_by_name['members']._options = None
  _MSGCREATEGROUP.fields_by_name['members']._serialized_options = b'\310\336\037\000'
  _MSGUPDATEGROUPMEMBERS.fields_by_name['member_updates']._options = None
  _MSGUPDATEGROUPMEMBERS.fields_by_name['member_updates']._serialized_options = b'\310\336\037\000'
  _MSGCREATEGROUPACCOUNT.fields_by_name['decision_policy']._options = None
  _MSGCREATEGROUPACCOUNT.fields_by_name['decision_policy']._serialized_options = b'\312\264-\016DecisionPolicy'
  _MSGCREATEGROUPACCOUNT._options = None
  _MSGCREATEGROUPACCOUNT._serialized_options = b'\210\240\037\000'
  _MSGUPDATEGROUPACCOUNTDECISIONPOLICY.fields_by_name['decision_policy']._options = None
  _MSGUPDATEGROUPACCOUNTDECISIONPOLICY.fields_by_name['decision_policy']._serialized_options = b'\312\264-\016DecisionPolicy'
  _MSGUPDATEGROUPACCOUNTDECISIONPOLICY._options = None
  _MSGUPDATEGROUPACCOUNTDECISIONPOLICY._serialized_options = b'\210\240\037\000'
  _MSGCREATEPROPOSAL._options = None
  _MSGCREATEPROPOSAL._serialized_options = b'\210\240\037\000'
  _globals['_EXEC']._serialized_start=2138
  _globals['_EXEC']._serialized_end=2180
  _globals['_MSGCREATEGROUP']._serialized_start=166
  _globals['_MSGCREATEGROUP']._serialized_end=294
  _globals['_MSGCREATEGROUPRESPONSE']._serialized_start=296
  _globals['_MSGCREATEGROUPRESPONSE']._serialized_end=347
  _globals['_MSGUPDATEGROUPMEMBERS']._serialized_start=350
  _globals['_MSGUPDATEGROUPMEMBERS']._serialized_end=497
  _globals['_MSGUPDATEGROUPMEMBERSRESPONSE']._serialized_start=499
  _globals['_MSGUPDATEGROUPMEMBERSRESPONSE']._serialized_end=530
  _globals['_MSGUPDATEGROUPADMIN']._serialized_start=532
  _globals['_MSGUPDATEGROUPADMIN']._serialized_end=631
  _globals['_MSGUPDATEGROUPADMINRESPONSE']._serialized_start=633
  _globals['_MSGUPDATEGROUPADMINRESPONSE']._serialized_end=662
  _globals['_MSGUPDATEGROUPMETADATA']._serialized_start=664
  _globals['_MSGUPDATEGROUPMETADATA']._serialized_end=765
  _globals['_MSGUPDATEGROUPMETADATARESPONSE']._serialized_start=767
  _globals['_MSGUPDATEGROUPMETADATARESPONSE']._serialized_end=799
  _globals['_MSGCREATEGROUPACCOUNT']._serialized_start=802
  _globals['_MSGCREATEGROUPACCOUNT']._serialized_end=991
  _globals['_MSGCREATEGROUPACCOUNTRESPONSE']._serialized_start=993
  _globals['_MSGCREATEGROUPACCOUNTRESPONSE']._serialized_end=1050
  _globals['_MSGUPDATEGROUPACCOUNTADMIN']._serialized_start=1052
  _globals['_MSGUPDATEGROUPACCOUNTADMIN']._serialized_end=1157
  _globals['_MSGUPDATEGROUPACCOUNTADMINRESPONSE']._serialized_start=1159
  _globals['_MSGUPDATEGROUPACCOUNTADMINRESPONSE']._serialized_end=1195
  _globals['_MSGUPDATEGROUPACCOUNTDECISIONPOLICY']._serialized_start=1198
  _globals['_MSGUPDATEGROUPACCOUNTDECISIONPOLICY']._serialized_end=1372
  _globals['_MSGUPDATEGROUPACCOUNTDECISIONPOLICYRESPONSE']._serialized_start=1374
  _globals['_MSGUPDATEGROUPACCOUNTDECISIONPOLICYRESPONSE']._serialized_end=1419
  _globals['_MSGUPDATEGROUPACCOUNTMETADATA']._serialized_start=1421
  _globals['_MSGUPDATEGROUPACCOUNTMETADATA']._serialized_end=1528
  _globals['_MSGUPDATEGROUPACCOUNTMETADATARESPONSE']._serialized_start=1530
  _globals['_MSGUPDATEGROUPACCOUNTMETADATARESPONSE']._serialized_end=1569
  _globals['_MSGCREATEPROPOSAL']._serialized_start=1572
  _globals['_MSGCREATEPROPOSAL']._serialized_end=1771
  _globals['_MSGCREATEPROPOSALRESPONSE']._serialized_start=1773
  _globals['_MSGCREATEPROPOSALRESPONSE']._serialized_end=1833
  _globals['_MSGVOTE']._serialized_start=1836
  _globals['_MSGVOTE']._serialized_end=2030
  _globals['_MSGVOTERESPONSE']._serialized_start=2032
  _globals['_MSGVOTERESPONSE']._serialized_end=2049
  _globals['_MSGEXEC']._serialized_start=2051
  _globals['_MSGEXEC']._serialized_end=2117
  _globals['_MSGEXECRESPONSE']._serialized_start=2119
  _globals['_MSGEXECRESPONSE']._serialized_end=2136
  _globals['_MSG']._serialized_start=2183
  _globals['_MSG']._serialized_end=3472
# @@protoc_insertion_point(module_scope)