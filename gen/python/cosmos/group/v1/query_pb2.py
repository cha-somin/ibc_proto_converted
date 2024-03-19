# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/group/v1/query.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.group.v1 import types_pb2 as cosmos_dot_group_dot_v1_dot_types__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x63osmos/group/v1/query.proto\x12\x0f\x63osmos.group.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1b\x63osmos/group/v1/types.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x11\x61mino/amino.proto\"2\n\x15QueryGroupInfoRequest\x12\x19\n\x08group_id\x18\x01 \x01(\x04R\x07groupId\"H\n\x16QueryGroupInfoResponse\x12.\n\x04info\x18\x01 \x01(\x0b\x32\x1a.cosmos.group.v1.GroupInfoR\x04info\"Q\n\x1bQueryGroupPolicyInfoRequest\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\"T\n\x1cQueryGroupPolicyInfoResponse\x12\x34\n\x04info\x18\x01 \x01(\x0b\x32 .cosmos.group.v1.GroupPolicyInfoR\x04info\"}\n\x18QueryGroupMembersRequest\x12\x19\n\x08group_id\x18\x01 \x01(\x04R\x07groupId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9c\x01\n\x19QueryGroupMembersResponse\x12\x36\n\x07members\x18\x01 \x03(\x0b\x32\x1c.cosmos.group.v1.GroupMemberR\x07members\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x93\x01\n\x19QueryGroupsByAdminRequest\x12.\n\x05\x61\x64min\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x05\x61\x64min\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x99\x01\n\x1aQueryGroupsByAdminResponse\x12\x32\n\x06groups\x18\x01 \x03(\x0b\x32\x1a.cosmos.group.v1.GroupInfoR\x06groups\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x85\x01\n QueryGroupPoliciesByGroupRequest\x12\x19\n\x08group_id\x18\x01 \x01(\x04R\x07groupId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xb5\x01\n!QueryGroupPoliciesByGroupResponse\x12G\n\x0egroup_policies\x18\x01 \x03(\x0b\x32 .cosmos.group.v1.GroupPolicyInfoR\rgroupPolicies\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x9a\x01\n QueryGroupPoliciesByAdminRequest\x12.\n\x05\x61\x64min\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x05\x61\x64min\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xb5\x01\n!QueryGroupPoliciesByAdminResponse\x12G\n\x0egroup_policies\x18\x01 \x03(\x0b\x32 .cosmos.group.v1.GroupPolicyInfoR\rgroupPolicies\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"7\n\x14QueryProposalRequest\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\"N\n\x15QueryProposalResponse\x12\x35\n\x08proposal\x18\x01 \x01(\x0b\x32\x19.cosmos.group.v1.ProposalR\x08proposal\"\xa0\x01\n\"QueryProposalsByGroupPolicyRequest\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa7\x01\n#QueryProposalsByGroupPolicyResponse\x12\x37\n\tproposals\x18\x01 \x03(\x0b\x32\x19.cosmos.group.v1.ProposalR\tproposals\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"r\n\x1fQueryVoteByProposalVoterRequest\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\x12.\n\x05voter\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x05voter\"M\n QueryVoteByProposalVoterResponse\x12)\n\x04vote\x18\x01 \x01(\x0b\x32\x15.cosmos.group.v1.VoteR\x04vote\"\x86\x01\n\x1bQueryVotesByProposalRequest\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x94\x01\n\x1cQueryVotesByProposalResponse\x12+\n\x05votes\x18\x01 \x03(\x0b\x32\x15.cosmos.group.v1.VoteR\x05votes\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x92\x01\n\x18QueryVotesByVoterRequest\x12.\n\x05voter\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x05voter\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x91\x01\n\x19QueryVotesByVoterResponse\x12+\n\x05votes\x18\x01 \x03(\x0b\x32\x15.cosmos.group.v1.VoteR\x05votes\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\x98\x01\n\x1aQueryGroupsByMemberRequest\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9a\x01\n\x1bQueryGroupsByMemberResponse\x12\x32\n\x06groups\x18\x01 \x03(\x0b\x32\x1a.cosmos.group.v1.GroupInfoR\x06groups\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\":\n\x17QueryTallyResultRequest\x12\x1f\n\x0bproposal_id\x18\x01 \x01(\x04R\nproposalId\"Y\n\x18QueryTallyResultResponse\x12=\n\x05tally\x18\x01 \x01(\x0b\x32\x1c.cosmos.group.v1.TallyResultB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x05tally\"\\\n\x12QueryGroupsRequest\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x92\x01\n\x13QueryGroupsResponse\x12\x32\n\x06groups\x18\x01 \x03(\x0b\x32\x1a.cosmos.group.v1.GroupInfoR\x06groups\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xfb\x11\n\x05Query\x12\x8c\x01\n\tGroupInfo\x12&.cosmos.group.v1.QueryGroupInfoRequest\x1a\'.cosmos.group.v1.QueryGroupInfoResponse\".\x82\xd3\xe4\x93\x02(\x12&/cosmos/group/v1/group_info/{group_id}\x12\xa4\x01\n\x0fGroupPolicyInfo\x12,.cosmos.group.v1.QueryGroupPolicyInfoRequest\x1a-.cosmos.group.v1.QueryGroupPolicyInfoResponse\"4\x82\xd3\xe4\x93\x02.\x12,/cosmos/group/v1/group_policy_info/{address}\x12\x98\x01\n\x0cGroupMembers\x12).cosmos.group.v1.QueryGroupMembersRequest\x1a*.cosmos.group.v1.QueryGroupMembersResponse\"1\x82\xd3\xe4\x93\x02+\x12)/cosmos/group/v1/group_members/{group_id}\x12\x9a\x01\n\rGroupsByAdmin\x12*.cosmos.group.v1.QueryGroupsByAdminRequest\x1a+.cosmos.group.v1.QueryGroupsByAdminResponse\"0\x82\xd3\xe4\x93\x02*\x12(/cosmos/group/v1/groups_by_admin/{admin}\x12\xba\x01\n\x14GroupPoliciesByGroup\x12\x31.cosmos.group.v1.QueryGroupPoliciesByGroupRequest\x1a\x32.cosmos.group.v1.QueryGroupPoliciesByGroupResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/cosmos/group/v1/group_policies_by_group/{group_id}\x12\xb7\x01\n\x14GroupPoliciesByAdmin\x12\x31.cosmos.group.v1.QueryGroupPoliciesByAdminRequest\x1a\x32.cosmos.group.v1.QueryGroupPoliciesByAdminResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/cosmos/group/v1/group_policies_by_admin/{admin}\x12\x8a\x01\n\x08Proposal\x12%.cosmos.group.v1.QueryProposalRequest\x1a&.cosmos.group.v1.QueryProposalResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/cosmos/group/v1/proposal/{proposal_id}\x12\xc1\x01\n\x16ProposalsByGroupPolicy\x12\x33.cosmos.group.v1.QueryProposalsByGroupPolicyRequest\x1a\x34.cosmos.group.v1.QueryProposalsByGroupPolicyResponse\"<\x82\xd3\xe4\x93\x02\x36\x12\x34/cosmos/group/v1/proposals_by_group_policy/{address}\x12\xc1\x01\n\x13VoteByProposalVoter\x12\x30.cosmos.group.v1.QueryVoteByProposalVoterRequest\x1a\x31.cosmos.group.v1.QueryVoteByProposalVoterResponse\"E\x82\xd3\xe4\x93\x02?\x12=/cosmos/group/v1/vote_by_proposal_voter/{proposal_id}/{voter}\x12\xa8\x01\n\x0fVotesByProposal\x12,.cosmos.group.v1.QueryVotesByProposalRequest\x1a-.cosmos.group.v1.QueryVotesByProposalResponse\"8\x82\xd3\xe4\x93\x02\x32\x12\x30/cosmos/group/v1/votes_by_proposal/{proposal_id}\x12\x96\x01\n\x0cVotesByVoter\x12).cosmos.group.v1.QueryVotesByVoterRequest\x1a*.cosmos.group.v1.QueryVotesByVoterResponse\"/\x82\xd3\xe4\x93\x02)\x12\'/cosmos/group/v1/votes_by_voter/{voter}\x12\xa0\x01\n\x0eGroupsByMember\x12+.cosmos.group.v1.QueryGroupsByMemberRequest\x1a,.cosmos.group.v1.QueryGroupsByMemberResponse\"3\x82\xd3\xe4\x93\x02-\x12+/cosmos/group/v1/groups_by_member/{address}\x12\x9a\x01\n\x0bTallyResult\x12(.cosmos.group.v1.QueryTallyResultRequest\x1a).cosmos.group.v1.QueryTallyResultResponse\"6\x82\xd3\xe4\x93\x02\x30\x12./cosmos/group/v1/proposals/{proposal_id}/tally\x12t\n\x06Groups\x12#.cosmos.group.v1.QueryGroupsRequest\x1a$.cosmos.group.v1.QueryGroupsResponse\"\x1f\x82\xd3\xe4\x93\x02\x19\x12\x17/cosmos/group/v1/groupsB\xa3\x01\n\x13\x63om.cosmos.group.v1B\nQueryProtoZ$github.com/cosmos/cosmos-sdk/x/group\xa2\x02\x03\x43GX\xaa\x02\x0f\x43osmos.Group.V1\xca\x02\x0f\x43osmos\\Group\\V1\xe2\x02\x1b\x43osmos\\Group\\V1\\GPBMetadata\xea\x02\x11\x43osmos::Group::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.group.v1.query_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\023com.cosmos.group.v1B\nQueryProtoZ$github.com/cosmos/cosmos-sdk/x/group\242\002\003CGX\252\002\017Cosmos.Group.V1\312\002\017Cosmos\\Group\\V1\342\002\033Cosmos\\Group\\V1\\GPBMetadata\352\002\021Cosmos::Group::V1'
  _globals['_QUERYGROUPPOLICYINFOREQUEST'].fields_by_name['address']._loaded_options = None
  _globals['_QUERYGROUPPOLICYINFOREQUEST'].fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYGROUPSBYADMINREQUEST'].fields_by_name['admin']._loaded_options = None
  _globals['_QUERYGROUPSBYADMINREQUEST'].fields_by_name['admin']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYGROUPPOLICIESBYADMINREQUEST'].fields_by_name['admin']._loaded_options = None
  _globals['_QUERYGROUPPOLICIESBYADMINREQUEST'].fields_by_name['admin']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYPROPOSALSBYGROUPPOLICYREQUEST'].fields_by_name['address']._loaded_options = None
  _globals['_QUERYPROPOSALSBYGROUPPOLICYREQUEST'].fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYVOTEBYPROPOSALVOTERREQUEST'].fields_by_name['voter']._loaded_options = None
  _globals['_QUERYVOTEBYPROPOSALVOTERREQUEST'].fields_by_name['voter']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYVOTESBYVOTERREQUEST'].fields_by_name['voter']._loaded_options = None
  _globals['_QUERYVOTESBYVOTERREQUEST'].fields_by_name['voter']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYGROUPSBYMEMBERREQUEST'].fields_by_name['address']._loaded_options = None
  _globals['_QUERYGROUPSBYMEMBERREQUEST'].fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_QUERYTALLYRESULTRESPONSE'].fields_by_name['tally']._loaded_options = None
  _globals['_QUERYTALLYRESULTRESPONSE'].fields_by_name['tally']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_QUERY'].methods_by_name['GroupInfo']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupInfo']._serialized_options = b'\202\323\344\223\002(\022&/cosmos/group/v1/group_info/{group_id}'
  _globals['_QUERY'].methods_by_name['GroupPolicyInfo']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupPolicyInfo']._serialized_options = b'\202\323\344\223\002.\022,/cosmos/group/v1/group_policy_info/{address}'
  _globals['_QUERY'].methods_by_name['GroupMembers']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupMembers']._serialized_options = b'\202\323\344\223\002+\022)/cosmos/group/v1/group_members/{group_id}'
  _globals['_QUERY'].methods_by_name['GroupsByAdmin']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupsByAdmin']._serialized_options = b'\202\323\344\223\002*\022(/cosmos/group/v1/groups_by_admin/{admin}'
  _globals['_QUERY'].methods_by_name['GroupPoliciesByGroup']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupPoliciesByGroup']._serialized_options = b'\202\323\344\223\0025\0223/cosmos/group/v1/group_policies_by_group/{group_id}'
  _globals['_QUERY'].methods_by_name['GroupPoliciesByAdmin']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupPoliciesByAdmin']._serialized_options = b'\202\323\344\223\0022\0220/cosmos/group/v1/group_policies_by_admin/{admin}'
  _globals['_QUERY'].methods_by_name['Proposal']._loaded_options = None
  _globals['_QUERY'].methods_by_name['Proposal']._serialized_options = b'\202\323\344\223\002)\022\'/cosmos/group/v1/proposal/{proposal_id}'
  _globals['_QUERY'].methods_by_name['ProposalsByGroupPolicy']._loaded_options = None
  _globals['_QUERY'].methods_by_name['ProposalsByGroupPolicy']._serialized_options = b'\202\323\344\223\0026\0224/cosmos/group/v1/proposals_by_group_policy/{address}'
  _globals['_QUERY'].methods_by_name['VoteByProposalVoter']._loaded_options = None
  _globals['_QUERY'].methods_by_name['VoteByProposalVoter']._serialized_options = b'\202\323\344\223\002?\022=/cosmos/group/v1/vote_by_proposal_voter/{proposal_id}/{voter}'
  _globals['_QUERY'].methods_by_name['VotesByProposal']._loaded_options = None
  _globals['_QUERY'].methods_by_name['VotesByProposal']._serialized_options = b'\202\323\344\223\0022\0220/cosmos/group/v1/votes_by_proposal/{proposal_id}'
  _globals['_QUERY'].methods_by_name['VotesByVoter']._loaded_options = None
  _globals['_QUERY'].methods_by_name['VotesByVoter']._serialized_options = b'\202\323\344\223\002)\022\'/cosmos/group/v1/votes_by_voter/{voter}'
  _globals['_QUERY'].methods_by_name['GroupsByMember']._loaded_options = None
  _globals['_QUERY'].methods_by_name['GroupsByMember']._serialized_options = b'\202\323\344\223\002-\022+/cosmos/group/v1/groups_by_member/{address}'
  _globals['_QUERY'].methods_by_name['TallyResult']._loaded_options = None
  _globals['_QUERY'].methods_by_name['TallyResult']._serialized_options = b'\202\323\344\223\0020\022./cosmos/group/v1/proposals/{proposal_id}/tally'
  _globals['_QUERY'].methods_by_name['Groups']._loaded_options = None
  _globals['_QUERY'].methods_by_name['Groups']._serialized_options = b'\202\323\344\223\002\031\022\027/cosmos/group/v1/groups'
  _globals['_QUERYGROUPINFOREQUEST']._serialized_start=219
  _globals['_QUERYGROUPINFOREQUEST']._serialized_end=269
  _globals['_QUERYGROUPINFORESPONSE']._serialized_start=271
  _globals['_QUERYGROUPINFORESPONSE']._serialized_end=343
  _globals['_QUERYGROUPPOLICYINFOREQUEST']._serialized_start=345
  _globals['_QUERYGROUPPOLICYINFOREQUEST']._serialized_end=426
  _globals['_QUERYGROUPPOLICYINFORESPONSE']._serialized_start=428
  _globals['_QUERYGROUPPOLICYINFORESPONSE']._serialized_end=512
  _globals['_QUERYGROUPMEMBERSREQUEST']._serialized_start=514
  _globals['_QUERYGROUPMEMBERSREQUEST']._serialized_end=639
  _globals['_QUERYGROUPMEMBERSRESPONSE']._serialized_start=642
  _globals['_QUERYGROUPMEMBERSRESPONSE']._serialized_end=798
  _globals['_QUERYGROUPSBYADMINREQUEST']._serialized_start=801
  _globals['_QUERYGROUPSBYADMINREQUEST']._serialized_end=948
  _globals['_QUERYGROUPSBYADMINRESPONSE']._serialized_start=951
  _globals['_QUERYGROUPSBYADMINRESPONSE']._serialized_end=1104
  _globals['_QUERYGROUPPOLICIESBYGROUPREQUEST']._serialized_start=1107
  _globals['_QUERYGROUPPOLICIESBYGROUPREQUEST']._serialized_end=1240
  _globals['_QUERYGROUPPOLICIESBYGROUPRESPONSE']._serialized_start=1243
  _globals['_QUERYGROUPPOLICIESBYGROUPRESPONSE']._serialized_end=1424
  _globals['_QUERYGROUPPOLICIESBYADMINREQUEST']._serialized_start=1427
  _globals['_QUERYGROUPPOLICIESBYADMINREQUEST']._serialized_end=1581
  _globals['_QUERYGROUPPOLICIESBYADMINRESPONSE']._serialized_start=1584
  _globals['_QUERYGROUPPOLICIESBYADMINRESPONSE']._serialized_end=1765
  _globals['_QUERYPROPOSALREQUEST']._serialized_start=1767
  _globals['_QUERYPROPOSALREQUEST']._serialized_end=1822
  _globals['_QUERYPROPOSALRESPONSE']._serialized_start=1824
  _globals['_QUERYPROPOSALRESPONSE']._serialized_end=1902
  _globals['_QUERYPROPOSALSBYGROUPPOLICYREQUEST']._serialized_start=1905
  _globals['_QUERYPROPOSALSBYGROUPPOLICYREQUEST']._serialized_end=2065
  _globals['_QUERYPROPOSALSBYGROUPPOLICYRESPONSE']._serialized_start=2068
  _globals['_QUERYPROPOSALSBYGROUPPOLICYRESPONSE']._serialized_end=2235
  _globals['_QUERYVOTEBYPROPOSALVOTERREQUEST']._serialized_start=2237
  _globals['_QUERYVOTEBYPROPOSALVOTERREQUEST']._serialized_end=2351
  _globals['_QUERYVOTEBYPROPOSALVOTERRESPONSE']._serialized_start=2353
  _globals['_QUERYVOTEBYPROPOSALVOTERRESPONSE']._serialized_end=2430
  _globals['_QUERYVOTESBYPROPOSALREQUEST']._serialized_start=2433
  _globals['_QUERYVOTESBYPROPOSALREQUEST']._serialized_end=2567
  _globals['_QUERYVOTESBYPROPOSALRESPONSE']._serialized_start=2570
  _globals['_QUERYVOTESBYPROPOSALRESPONSE']._serialized_end=2718
  _globals['_QUERYVOTESBYVOTERREQUEST']._serialized_start=2721
  _globals['_QUERYVOTESBYVOTERREQUEST']._serialized_end=2867
  _globals['_QUERYVOTESBYVOTERRESPONSE']._serialized_start=2870
  _globals['_QUERYVOTESBYVOTERRESPONSE']._serialized_end=3015
  _globals['_QUERYGROUPSBYMEMBERREQUEST']._serialized_start=3018
  _globals['_QUERYGROUPSBYMEMBERREQUEST']._serialized_end=3170
  _globals['_QUERYGROUPSBYMEMBERRESPONSE']._serialized_start=3173
  _globals['_QUERYGROUPSBYMEMBERRESPONSE']._serialized_end=3327
  _globals['_QUERYTALLYRESULTREQUEST']._serialized_start=3329
  _globals['_QUERYTALLYRESULTREQUEST']._serialized_end=3387
  _globals['_QUERYTALLYRESULTRESPONSE']._serialized_start=3389
  _globals['_QUERYTALLYRESULTRESPONSE']._serialized_end=3478
  _globals['_QUERYGROUPSREQUEST']._serialized_start=3480
  _globals['_QUERYGROUPSREQUEST']._serialized_end=3572
  _globals['_QUERYGROUPSRESPONSE']._serialized_start=3575
  _globals['_QUERYGROUPSRESPONSE']._serialized_end=3721
  _globals['_QUERY']._serialized_start=3724
  _globals['_QUERY']._serialized_end=6023
# @@protoc_insertion_point(module_scope)
