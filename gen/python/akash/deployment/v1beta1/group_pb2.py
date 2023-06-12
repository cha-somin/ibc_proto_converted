# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta1/group.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.base.v1beta1 import resource_pb2 as akash_dot_base_dot_v1beta1_dot_resource__pb2
from akash.base.v1beta1 import attribute_pb2 as akash_dot_base_dot_v1beta1_dot_attribute__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$akash/deployment/v1beta1/group.proto\x12\x18\x61kash.deployment.v1beta1\x1a\x14gogoproto/gogo.proto\x1a!akash/base/v1beta1/resource.proto\x1a\"akash/base/v1beta1/attribute.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"g\n\rMsgCloseGroup\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta1.GroupIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x17\n\x15MsgCloseGroupResponse\"g\n\rMsgPauseGroup\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta1.GroupIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x17\n\x15MsgPauseGroupResponse\"g\n\rMsgStartGroup\x12P\n\x02id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta1.GroupIDB\x1d\xc8\xde\x1f\x00\xe2\xde\x1f\x02ID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x02id:\x04\xe8\xa0\x1f\x00\"\x17\n\x15MsgStartGroupResponse\"\xae\x01\n\x07GroupID\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12\x33\n\x04\x64seq\x18\x02 \x01(\x04\x42\x1f\xe2\xde\x1f\x04\x44Seq\xea\xde\x1f\x04\x64seq\xf2\xde\x1f\x0byaml:\"dseq\"R\x04\x64seq\x12\x33\n\x04gseq\x18\x03 \x01(\rB\x1f\xe2\xde\x1f\x04GSeq\xea\xde\x1f\x04gseq\xf2\xde\x1f\x0byaml:\"gseq\"R\x04gseq:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xa7\x02\n\tGroupSpec\x12+\n\x04name\x18\x01 \x01(\tB\x17\xea\xde\x1f\x04name\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12z\n\x0crequirements\x18\x02 \x01(\x0b\x32).akash.base.v1beta1.PlacementRequirementsB+\xc8\xde\x1f\x00\xea\xde\x1f\x0crequirements\xf2\xde\x1f\x13yaml:\"requirements\"R\x0crequirements\x12g\n\tresources\x18\x03 \x03(\x0b\x32\".akash.deployment.v1beta1.ResourceB%\xc8\xde\x1f\x00\xea\xde\x1f\tresources\xf2\xde\x1f\x10yaml:\"resources\"R\tresources:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x82\x04\n\x05Group\x12`\n\x08group_id\x18\x01 \x01(\x0b\x32!.akash.deployment.v1beta1.GroupIDB\"\xc8\xde\x1f\x00\xe2\xde\x1f\x07GroupID\xea\xde\x1f\x02id\xf2\xde\x1f\tyaml:\"id\"R\x07groupId\x12V\n\x05state\x18\x02 \x01(\x0e\x32%.akash.deployment.v1beta1.Group.StateB\x19\xea\xde\x1f\x05state\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12_\n\ngroup_spec\x18\x03 \x01(\x0b\x32#.akash.deployment.v1beta1.GroupSpecB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04spec\xf2\xde\x1f\x0byaml:\"spec\"R\tgroupSpec\x12\x1d\n\ncreated_at\x18\x04 \x01(\x03R\tcreatedAt\"\xb8\x01\n\x05State\x12\"\n\x07invalid\x10\x00\x1a\x15\x8a\x9d \x11GroupStateInvalid\x12\x17\n\x04open\x10\x01\x1a\r\x8a\x9d \tGroupOpen\x12\x1b\n\x06paused\x10\x02\x1a\x0f\x8a\x9d \x0bGroupPaused\x12\x32\n\x12insufficient_funds\x10\x03\x1a\x1a\x8a\x9d \x16GroupInsufficientFunds\x12\x1b\n\x06\x63losed\x10\x04\x1a\x0f\x8a\x9d \x0bGroupClosed\x1a\x04\x88\xa3\x1e\x00:\x04\xe8\xa0\x1f\x00\"\xef\x01\n\x08Resource\x12\\\n\tresources\x18\x01 \x01(\x0b\x32!.akash.base.v1beta1.ResourceUnitsB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04unit\xf2\xde\x1f\x0byaml:\"unit\"R\tresources\x12/\n\x05\x63ount\x18\x02 \x01(\rB\x19\xea\xde\x1f\x05\x63ount\xf2\xde\x1f\x0cyaml:\"count\"R\x05\x63ount\x12N\n\x05price\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1d\xc8\xde\x1f\x00\xea\xde\x1f\x05price\xf2\xde\x1f\x0cyaml:\"price\"R\x05price:\x04\xe8\xa0\x1f\x00\x42\xeb\x01\n\x1c\x63om.akash.deployment.v1beta1B\nGroupProtoP\x01Z=github.com/akash-network/akash-api/go/node/deployment/v1beta1\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta1\xca\x02\x18\x41kash\\Deployment\\V1beta1\xe2\x02$Akash\\Deployment\\V1beta1\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta1.group_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.akash.deployment.v1beta1B\nGroupProtoP\001Z=github.com/akash-network/akash-api/go/node/deployment/v1beta1\242\002\003ADX\252\002\030Akash.Deployment.V1beta1\312\002\030Akash\\Deployment\\V1beta1\342\002$Akash\\Deployment\\V1beta1\\GPBMetadata\352\002\032Akash::Deployment::V1beta1'
  _MSGCLOSEGROUP.fields_by_name['id']._options = None
  _MSGCLOSEGROUP.fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _MSGCLOSEGROUP._options = None
  _MSGCLOSEGROUP._serialized_options = b'\350\240\037\000'
  _MSGPAUSEGROUP.fields_by_name['id']._options = None
  _MSGPAUSEGROUP.fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _MSGPAUSEGROUP._options = None
  _MSGPAUSEGROUP._serialized_options = b'\350\240\037\000'
  _MSGSTARTGROUP.fields_by_name['id']._options = None
  _MSGSTARTGROUP.fields_by_name['id']._serialized_options = b'\310\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _MSGSTARTGROUP._options = None
  _MSGSTARTGROUP._serialized_options = b'\350\240\037\000'
  _GROUPID.fields_by_name['owner']._options = None
  _GROUPID.fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _GROUPID.fields_by_name['dseq']._options = None
  _GROUPID.fields_by_name['dseq']._serialized_options = b'\342\336\037\004DSeq\352\336\037\004dseq\362\336\037\013yaml:\"dseq\"'
  _GROUPID.fields_by_name['gseq']._options = None
  _GROUPID.fields_by_name['gseq']._serialized_options = b'\342\336\037\004GSeq\352\336\037\004gseq\362\336\037\013yaml:\"gseq\"'
  _GROUPID._options = None
  _GROUPID._serialized_options = b'\230\240\037\000\350\240\037\000'
  _GROUPSPEC.fields_by_name['name']._options = None
  _GROUPSPEC.fields_by_name['name']._serialized_options = b'\352\336\037\004name\362\336\037\013yaml:\"name\"'
  _GROUPSPEC.fields_by_name['requirements']._options = None
  _GROUPSPEC.fields_by_name['requirements']._serialized_options = b'\310\336\037\000\352\336\037\014requirements\362\336\037\023yaml:\"requirements\"'
  _GROUPSPEC.fields_by_name['resources']._options = None
  _GROUPSPEC.fields_by_name['resources']._serialized_options = b'\310\336\037\000\352\336\037\tresources\362\336\037\020yaml:\"resources\"'
  _GROUPSPEC._options = None
  _GROUPSPEC._serialized_options = b'\210\240\037\000\350\240\037\000'
  _GROUP_STATE._options = None
  _GROUP_STATE._serialized_options = b'\210\243\036\000'
  _GROUP_STATE.values_by_name["invalid"]._options = None
  _GROUP_STATE.values_by_name["invalid"]._serialized_options = b'\212\235 \021GroupStateInvalid'
  _GROUP_STATE.values_by_name["open"]._options = None
  _GROUP_STATE.values_by_name["open"]._serialized_options = b'\212\235 \tGroupOpen'
  _GROUP_STATE.values_by_name["paused"]._options = None
  _GROUP_STATE.values_by_name["paused"]._serialized_options = b'\212\235 \013GroupPaused'
  _GROUP_STATE.values_by_name["insufficient_funds"]._options = None
  _GROUP_STATE.values_by_name["insufficient_funds"]._serialized_options = b'\212\235 \026GroupInsufficientFunds'
  _GROUP_STATE.values_by_name["closed"]._options = None
  _GROUP_STATE.values_by_name["closed"]._serialized_options = b'\212\235 \013GroupClosed'
  _GROUP.fields_by_name['group_id']._options = None
  _GROUP.fields_by_name['group_id']._serialized_options = b'\310\336\037\000\342\336\037\007GroupID\352\336\037\002id\362\336\037\tyaml:\"id\"'
  _GROUP.fields_by_name['state']._options = None
  _GROUP.fields_by_name['state']._serialized_options = b'\352\336\037\005state\362\336\037\014yaml:\"state\"'
  _GROUP.fields_by_name['group_spec']._options = None
  _GROUP.fields_by_name['group_spec']._serialized_options = b'\310\336\037\000\352\336\037\004spec\362\336\037\013yaml:\"spec\"'
  _GROUP._options = None
  _GROUP._serialized_options = b'\350\240\037\000'
  _RESOURCE.fields_by_name['resources']._options = None
  _RESOURCE.fields_by_name['resources']._serialized_options = b'\310\336\037\000\352\336\037\004unit\362\336\037\013yaml:\"unit\"'
  _RESOURCE.fields_by_name['count']._options = None
  _RESOURCE.fields_by_name['count']._serialized_options = b'\352\336\037\005count\362\336\037\014yaml:\"count\"'
  _RESOURCE.fields_by_name['price']._options = None
  _RESOURCE.fields_by_name['price']._serialized_options = b'\310\336\037\000\352\336\037\005price\362\336\037\014yaml:\"price\"'
  _RESOURCE._options = None
  _RESOURCE._serialized_options = b'\350\240\037\000'
  _globals['_MSGCLOSEGROUP']._serialized_start=191
  _globals['_MSGCLOSEGROUP']._serialized_end=294
  _globals['_MSGCLOSEGROUPRESPONSE']._serialized_start=296
  _globals['_MSGCLOSEGROUPRESPONSE']._serialized_end=319
  _globals['_MSGPAUSEGROUP']._serialized_start=321
  _globals['_MSGPAUSEGROUP']._serialized_end=424
  _globals['_MSGPAUSEGROUPRESPONSE']._serialized_start=426
  _globals['_MSGPAUSEGROUPRESPONSE']._serialized_end=449
  _globals['_MSGSTARTGROUP']._serialized_start=451
  _globals['_MSGSTARTGROUP']._serialized_end=554
  _globals['_MSGSTARTGROUPRESPONSE']._serialized_start=556
  _globals['_MSGSTARTGROUPRESPONSE']._serialized_end=579
  _globals['_GROUPID']._serialized_start=582
  _globals['_GROUPID']._serialized_end=756
  _globals['_GROUPSPEC']._serialized_start=759
  _globals['_GROUPSPEC']._serialized_end=1054
  _globals['_GROUP']._serialized_start=1057
  _globals['_GROUP']._serialized_end=1571
  _globals['_GROUP_STATE']._serialized_start=1381
  _globals['_GROUP_STATE']._serialized_end=1565
  _globals['_RESOURCE']._serialized_start=1574
  _globals['_RESOURCE']._serialized_end=1813
# @@protoc_insertion_point(module_scope)
