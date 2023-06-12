# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/evm/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.vote.exported.v1beta1 import types_pb2 as axelar_dot_vote_dot_exported_dot_v1beta1_dot_types__pb2
from axelar.tss.exported.v1beta1 import types_pb2 as axelar_dot_tss_dot_exported_dot_v1beta1_dot_types__pb2
from axelar.evm.v1beta1 import types_pb2 as axelar_dot_evm_dot_v1beta1_dot_types__pb2
from axelar.permission.exported.v1beta1 import types_pb2 as axelar_dot_permission_dot_exported_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x61xelar/evm/v1beta1/tx.proto\x12\x12\x61xelar.evm.v1beta1\x1a\x14gogoproto/gogo.proto\x1a(axelar/vote/exported/v1beta1/types.proto\x1a\'axelar/tss/exported/v1beta1/types.proto\x1a\x1e\x61xelar/evm/v1beta1/types.proto\x1a.axelar/permission/exported/v1beta1/types.proto\"\xea\x01\n\x11SetGatewayRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x07\x61\x64\x64ress\x18\x03 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x07\x61\x64\x64ress:\x04\x80\xb5\x18\x03\"\x14\n\x12SetGatewayResponse\"\xf2\x01\n\x17\x43onfirmGatewayTxRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x05tx_id\x18\x03 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId:\x06\x18\x01\x80\xb5\x18\x01\"\x1e\n\x18\x43onfirmGatewayTxResponse:\x02\x18\x01\"\xf4\x01\n\x18\x43onfirmGatewayTxsRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12,\n\x06tx_ids\x18\x03 \x03(\x0c\x42\x15\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x05TxIDsR\x05txIds:\x04\x80\xb5\x18\x01\"\x1b\n\x19\x43onfirmGatewayTxsResponse\"\xf1\x02\n\x15\x43onfirmDepositRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x05tx_id\x18\x03 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId\x12I\n\x06\x61mount\x18\x04 \x01(\x0c\x42\x31\x18\x01\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount\x12\x36\n\x0e\x62urner_address\x18\x05 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\rburnerAddress:\x04\x80\xb5\x18\x01\"\x18\n\x16\x43onfirmDepositResponse\"\xa3\x02\n\x13\x43onfirmTokenRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x05tx_id\x18\x03 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId\x12\x35\n\x05\x61sset\x18\x04 \x01(\x0b\x32\x19.axelar.evm.v1beta1.AssetB\x04\xc8\xde\x1f\x00R\x05\x61sset:\x04\x80\xb5\x18\x01\"\x16\n\x14\x43onfirmTokenResponse\"\xfe\x01\n\x19\x43onfirmTransferKeyRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x05tx_id\x18\x03 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId:\x04\x80\xb5\x18\x01J\x04\x08\x04\x10\x05J\x04\x08\x05\x10\x06\"\x1c\n\x1a\x43onfirmTransferKeyResponse\"\xe4\x02\n\x0bLinkRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12%\n\x0erecipient_addr\x18\x03 \x01(\tR\rrecipientAddr\x12\x14\n\x05\x61sset\x18\x04 \x01(\tR\x05\x61sset\x12l\n\x0frecipient_chain\x18\x05 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x0erecipientChain:\x04\x80\xb5\x18\x01\"1\n\x0cLinkResponse\x12!\n\x0c\x64\x65posit_addr\x18\x01 \x01(\tR\x0b\x64\x65positAddr\"\xc5\x01\n\x17\x43reateBurnTokensRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain:\x04\x80\xb5\x18\x01\"\x1a\n\x18\x43reateBurnTokensResponse\"\xa5\x03\n\x18\x43reateDeployTokenRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x35\n\x05\x61sset\x18\x03 \x01(\x0b\x32\x19.axelar.evm.v1beta1.AssetB\x04\xc8\xde\x1f\x00R\x05\x61sset\x12K\n\rtoken_details\x18\x04 \x01(\x0b\x32 .axelar.evm.v1beta1.TokenDetailsB\x04\xc8\xde\x1f\x00R\x0ctokenDetails\x12)\n\x07\x61\x64\x64ress\x18\x06 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x07\x61\x64\x64ress\x12(\n\x10\x64\x61ily_mint_limit\x18\x07 \x01(\tR\x0e\x64\x61ilyMintLimit:\x04\x80\xb5\x18\x02J\x04\x08\x05\x10\x06\"\x1b\n\x19\x43reateDeployTokenResponse\"\xcb\x01\n\x1d\x43reatePendingTransfersRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain:\x04\x80\xb5\x18\x01\" \n\x1e\x43reatePendingTransfersResponse\"\xb2\x02\n\x1e\x43reateTransferOwnershipRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x62\n\x06key_id\x18\x03 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId:\x06\x18\x01\x80\xb5\x18\x02\"%\n\x1f\x43reateTransferOwnershipResponse:\x02\x18\x01\"\xb3\x02\n!CreateTransferOperatorshipRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x62\n\x06key_id\x18\x03 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId:\x04\x80\xb5\x18\x02\"$\n\"CreateTransferOperatorshipResponse\"\xc1\x01\n\x13SignCommandsRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain:\x04\x80\xb5\x18\x01\"\x82\x01\n\x14SignCommandsResponse\x12\x45\n\x13\x62\x61tched_commands_id\x18\x01 \x01(\x0c\x42\x15\xe2\xde\x1f\x11\x42\x61tchedCommandsIDR\x11\x62\x61tchedCommandsId\x12#\n\rcommand_count\x18\x02 \x01(\rR\x0c\x63ommandCount\"\xae\x02\n\x0f\x41\x64\x64\x43hainRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12W\n\x04name\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x04name\x12\x43\n\x08key_type\x18\x04 \x01(\x0e\x32$.axelar.tss.exported.v1beta1.KeyTypeB\x02\x18\x01R\x07keyType\x12&\n\x06params\x18\x05 \x01(\x0c\x42\x0e\xc8\xde\x1f\x00\xda\xde\x1f\x06ParamsR\x06params:\x04\x80\xb5\x18\x03J\x04\x08\x03\x10\x04\"\x12\n\x10\x41\x64\x64\x43hainResponse\"\xf8\x01\n\x17RetryFailedEventRequest\x12I\n\x06sender\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06sender\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x31\n\x08\x65vent_id\x18\x03 \x01(\tB\x16\xe2\xde\x1f\x07\x45ventID\xfa\xde\x1f\x07\x45ventIDR\x07\x65ventId:\x04\x80\xb5\x18\x01\"\x1a\n\x18RetryFailedEventResponseB\xc1\x01\n\x16\x63om.axelar.evm.v1beta1B\x07TxProtoP\x01Z0github.com/axelarnetwork/axelar-core/x/evm/types\xa2\x02\x03\x41\x45X\xaa\x02\x12\x41xelar.Evm.V1beta1\xca\x02\x12\x41xelar\\Evm\\V1beta1\xe2\x02\x1e\x41xelar\\Evm\\V1beta1\\GPBMetadata\xea\x02\x14\x41xelar::Evm::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.evm.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.axelar.evm.v1beta1B\007TxProtoP\001Z0github.com/axelarnetwork/axelar-core/x/evm/types\242\002\003AEX\252\002\022Axelar.Evm.V1beta1\312\002\022Axelar\\Evm\\V1beta1\342\002\036Axelar\\Evm\\V1beta1\\GPBMetadata\352\002\024Axelar::Evm::V1beta1\310\341\036\000'
  _SETGATEWAYREQUEST.fields_by_name['sender']._options = None
  _SETGATEWAYREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _SETGATEWAYREQUEST.fields_by_name['chain']._options = None
  _SETGATEWAYREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _SETGATEWAYREQUEST.fields_by_name['address']._options = None
  _SETGATEWAYREQUEST.fields_by_name['address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _SETGATEWAYREQUEST._options = None
  _SETGATEWAYREQUEST._serialized_options = b'\200\265\030\003'
  _CONFIRMGATEWAYTXREQUEST.fields_by_name['sender']._options = None
  _CONFIRMGATEWAYTXREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CONFIRMGATEWAYTXREQUEST.fields_by_name['chain']._options = None
  _CONFIRMGATEWAYTXREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CONFIRMGATEWAYTXREQUEST.fields_by_name['tx_id']._options = None
  _CONFIRMGATEWAYTXREQUEST.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _CONFIRMGATEWAYTXREQUEST._options = None
  _CONFIRMGATEWAYTXREQUEST._serialized_options = b'\030\001\200\265\030\001'
  _CONFIRMGATEWAYTXRESPONSE._options = None
  _CONFIRMGATEWAYTXRESPONSE._serialized_options = b'\030\001'
  _CONFIRMGATEWAYTXSREQUEST.fields_by_name['sender']._options = None
  _CONFIRMGATEWAYTXSREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CONFIRMGATEWAYTXSREQUEST.fields_by_name['chain']._options = None
  _CONFIRMGATEWAYTXSREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CONFIRMGATEWAYTXSREQUEST.fields_by_name['tx_ids']._options = None
  _CONFIRMGATEWAYTXSREQUEST.fields_by_name['tx_ids']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\005TxIDs'
  _CONFIRMGATEWAYTXSREQUEST._options = None
  _CONFIRMGATEWAYTXSREQUEST._serialized_options = b'\200\265\030\001'
  _CONFIRMDEPOSITREQUEST.fields_by_name['sender']._options = None
  _CONFIRMDEPOSITREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CONFIRMDEPOSITREQUEST.fields_by_name['chain']._options = None
  _CONFIRMDEPOSITREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CONFIRMDEPOSITREQUEST.fields_by_name['tx_id']._options = None
  _CONFIRMDEPOSITREQUEST.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _CONFIRMDEPOSITREQUEST.fields_by_name['amount']._options = None
  _CONFIRMDEPOSITREQUEST.fields_by_name['amount']._serialized_options = b'\030\001\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _CONFIRMDEPOSITREQUEST.fields_by_name['burner_address']._options = None
  _CONFIRMDEPOSITREQUEST.fields_by_name['burner_address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _CONFIRMDEPOSITREQUEST._options = None
  _CONFIRMDEPOSITREQUEST._serialized_options = b'\200\265\030\001'
  _CONFIRMTOKENREQUEST.fields_by_name['sender']._options = None
  _CONFIRMTOKENREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CONFIRMTOKENREQUEST.fields_by_name['chain']._options = None
  _CONFIRMTOKENREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CONFIRMTOKENREQUEST.fields_by_name['tx_id']._options = None
  _CONFIRMTOKENREQUEST.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _CONFIRMTOKENREQUEST.fields_by_name['asset']._options = None
  _CONFIRMTOKENREQUEST.fields_by_name['asset']._serialized_options = b'\310\336\037\000'
  _CONFIRMTOKENREQUEST._options = None
  _CONFIRMTOKENREQUEST._serialized_options = b'\200\265\030\001'
  _CONFIRMTRANSFERKEYREQUEST.fields_by_name['sender']._options = None
  _CONFIRMTRANSFERKEYREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CONFIRMTRANSFERKEYREQUEST.fields_by_name['chain']._options = None
  _CONFIRMTRANSFERKEYREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CONFIRMTRANSFERKEYREQUEST.fields_by_name['tx_id']._options = None
  _CONFIRMTRANSFERKEYREQUEST.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _CONFIRMTRANSFERKEYREQUEST._options = None
  _CONFIRMTRANSFERKEYREQUEST._serialized_options = b'\200\265\030\001'
  _LINKREQUEST.fields_by_name['sender']._options = None
  _LINKREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _LINKREQUEST.fields_by_name['chain']._options = None
  _LINKREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _LINKREQUEST.fields_by_name['recipient_chain']._options = None
  _LINKREQUEST.fields_by_name['recipient_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _LINKREQUEST._options = None
  _LINKREQUEST._serialized_options = b'\200\265\030\001'
  _CREATEBURNTOKENSREQUEST.fields_by_name['sender']._options = None
  _CREATEBURNTOKENSREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CREATEBURNTOKENSREQUEST.fields_by_name['chain']._options = None
  _CREATEBURNTOKENSREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CREATEBURNTOKENSREQUEST._options = None
  _CREATEBURNTOKENSREQUEST._serialized_options = b'\200\265\030\001'
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['sender']._options = None
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['chain']._options = None
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['asset']._options = None
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['asset']._serialized_options = b'\310\336\037\000'
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['token_details']._options = None
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['token_details']._serialized_options = b'\310\336\037\000'
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['address']._options = None
  _CREATEDEPLOYTOKENREQUEST.fields_by_name['address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _CREATEDEPLOYTOKENREQUEST._options = None
  _CREATEDEPLOYTOKENREQUEST._serialized_options = b'\200\265\030\002'
  _CREATEPENDINGTRANSFERSREQUEST.fields_by_name['sender']._options = None
  _CREATEPENDINGTRANSFERSREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CREATEPENDINGTRANSFERSREQUEST.fields_by_name['chain']._options = None
  _CREATEPENDINGTRANSFERSREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CREATEPENDINGTRANSFERSREQUEST._options = None
  _CREATEPENDINGTRANSFERSREQUEST._serialized_options = b'\200\265\030\001'
  _CREATETRANSFEROWNERSHIPREQUEST.fields_by_name['sender']._options = None
  _CREATETRANSFEROWNERSHIPREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CREATETRANSFEROWNERSHIPREQUEST.fields_by_name['chain']._options = None
  _CREATETRANSFEROWNERSHIPREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CREATETRANSFEROWNERSHIPREQUEST.fields_by_name['key_id']._options = None
  _CREATETRANSFEROWNERSHIPREQUEST.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _CREATETRANSFEROWNERSHIPREQUEST._options = None
  _CREATETRANSFEROWNERSHIPREQUEST._serialized_options = b'\030\001\200\265\030\002'
  _CREATETRANSFEROWNERSHIPRESPONSE._options = None
  _CREATETRANSFEROWNERSHIPRESPONSE._serialized_options = b'\030\001'
  _CREATETRANSFEROPERATORSHIPREQUEST.fields_by_name['sender']._options = None
  _CREATETRANSFEROPERATORSHIPREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _CREATETRANSFEROPERATORSHIPREQUEST.fields_by_name['chain']._options = None
  _CREATETRANSFEROPERATORSHIPREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _CREATETRANSFEROPERATORSHIPREQUEST.fields_by_name['key_id']._options = None
  _CREATETRANSFEROPERATORSHIPREQUEST.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _CREATETRANSFEROPERATORSHIPREQUEST._options = None
  _CREATETRANSFEROPERATORSHIPREQUEST._serialized_options = b'\200\265\030\002'
  _SIGNCOMMANDSREQUEST.fields_by_name['sender']._options = None
  _SIGNCOMMANDSREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _SIGNCOMMANDSREQUEST.fields_by_name['chain']._options = None
  _SIGNCOMMANDSREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _SIGNCOMMANDSREQUEST._options = None
  _SIGNCOMMANDSREQUEST._serialized_options = b'\200\265\030\001'
  _SIGNCOMMANDSRESPONSE.fields_by_name['batched_commands_id']._options = None
  _SIGNCOMMANDSRESPONSE.fields_by_name['batched_commands_id']._serialized_options = b'\342\336\037\021BatchedCommandsID'
  _ADDCHAINREQUEST.fields_by_name['sender']._options = None
  _ADDCHAINREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _ADDCHAINREQUEST.fields_by_name['name']._options = None
  _ADDCHAINREQUEST.fields_by_name['name']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _ADDCHAINREQUEST.fields_by_name['key_type']._options = None
  _ADDCHAINREQUEST.fields_by_name['key_type']._serialized_options = b'\030\001'
  _ADDCHAINREQUEST.fields_by_name['params']._options = None
  _ADDCHAINREQUEST.fields_by_name['params']._serialized_options = b'\310\336\037\000\332\336\037\006Params'
  _ADDCHAINREQUEST._options = None
  _ADDCHAINREQUEST._serialized_options = b'\200\265\030\003'
  _RETRYFAILEDEVENTREQUEST.fields_by_name['sender']._options = None
  _RETRYFAILEDEVENTREQUEST.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _RETRYFAILEDEVENTREQUEST.fields_by_name['chain']._options = None
  _RETRYFAILEDEVENTREQUEST.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _RETRYFAILEDEVENTREQUEST.fields_by_name['event_id']._options = None
  _RETRYFAILEDEVENTREQUEST.fields_by_name['event_id']._serialized_options = b'\342\336\037\007EventID\372\336\037\007EventID'
  _RETRYFAILEDEVENTREQUEST._options = None
  _RETRYFAILEDEVENTREQUEST._serialized_options = b'\200\265\030\001'
  _globals['_SETGATEWAYREQUEST']._serialized_start=237
  _globals['_SETGATEWAYREQUEST']._serialized_end=471
  _globals['_SETGATEWAYRESPONSE']._serialized_start=473
  _globals['_SETGATEWAYRESPONSE']._serialized_end=493
  _globals['_CONFIRMGATEWAYTXREQUEST']._serialized_start=496
  _globals['_CONFIRMGATEWAYTXREQUEST']._serialized_end=738
  _globals['_CONFIRMGATEWAYTXRESPONSE']._serialized_start=740
  _globals['_CONFIRMGATEWAYTXRESPONSE']._serialized_end=770
  _globals['_CONFIRMGATEWAYTXSREQUEST']._serialized_start=773
  _globals['_CONFIRMGATEWAYTXSREQUEST']._serialized_end=1017
  _globals['_CONFIRMGATEWAYTXSRESPONSE']._serialized_start=1019
  _globals['_CONFIRMGATEWAYTXSRESPONSE']._serialized_end=1046
  _globals['_CONFIRMDEPOSITREQUEST']._serialized_start=1049
  _globals['_CONFIRMDEPOSITREQUEST']._serialized_end=1418
  _globals['_CONFIRMDEPOSITRESPONSE']._serialized_start=1420
  _globals['_CONFIRMDEPOSITRESPONSE']._serialized_end=1444
  _globals['_CONFIRMTOKENREQUEST']._serialized_start=1447
  _globals['_CONFIRMTOKENREQUEST']._serialized_end=1738
  _globals['_CONFIRMTOKENRESPONSE']._serialized_start=1740
  _globals['_CONFIRMTOKENRESPONSE']._serialized_end=1762
  _globals['_CONFIRMTRANSFERKEYREQUEST']._serialized_start=1765
  _globals['_CONFIRMTRANSFERKEYREQUEST']._serialized_end=2019
  _globals['_CONFIRMTRANSFERKEYRESPONSE']._serialized_start=2021
  _globals['_CONFIRMTRANSFERKEYRESPONSE']._serialized_end=2049
  _globals['_LINKREQUEST']._serialized_start=2052
  _globals['_LINKREQUEST']._serialized_end=2408
  _globals['_LINKRESPONSE']._serialized_start=2410
  _globals['_LINKRESPONSE']._serialized_end=2459
  _globals['_CREATEBURNTOKENSREQUEST']._serialized_start=2462
  _globals['_CREATEBURNTOKENSREQUEST']._serialized_end=2659
  _globals['_CREATEBURNTOKENSRESPONSE']._serialized_start=2661
  _globals['_CREATEBURNTOKENSRESPONSE']._serialized_end=2687
  _globals['_CREATEDEPLOYTOKENREQUEST']._serialized_start=2690
  _globals['_CREATEDEPLOYTOKENREQUEST']._serialized_end=3111
  _globals['_CREATEDEPLOYTOKENRESPONSE']._serialized_start=3113
  _globals['_CREATEDEPLOYTOKENRESPONSE']._serialized_end=3140
  _globals['_CREATEPENDINGTRANSFERSREQUEST']._serialized_start=3143
  _globals['_CREATEPENDINGTRANSFERSREQUEST']._serialized_end=3346
  _globals['_CREATEPENDINGTRANSFERSRESPONSE']._serialized_start=3348
  _globals['_CREATEPENDINGTRANSFERSRESPONSE']._serialized_end=3380
  _globals['_CREATETRANSFEROWNERSHIPREQUEST']._serialized_start=3383
  _globals['_CREATETRANSFEROWNERSHIPREQUEST']._serialized_end=3689
  _globals['_CREATETRANSFEROWNERSHIPRESPONSE']._serialized_start=3691
  _globals['_CREATETRANSFEROWNERSHIPRESPONSE']._serialized_end=3728
  _globals['_CREATETRANSFEROPERATORSHIPREQUEST']._serialized_start=3731
  _globals['_CREATETRANSFEROPERATORSHIPREQUEST']._serialized_end=4038
  _globals['_CREATETRANSFEROPERATORSHIPRESPONSE']._serialized_start=4040
  _globals['_CREATETRANSFEROPERATORSHIPRESPONSE']._serialized_end=4076
  _globals['_SIGNCOMMANDSREQUEST']._serialized_start=4079
  _globals['_SIGNCOMMANDSREQUEST']._serialized_end=4272
  _globals['_SIGNCOMMANDSRESPONSE']._serialized_start=4275
  _globals['_SIGNCOMMANDSRESPONSE']._serialized_end=4405
  _globals['_ADDCHAINREQUEST']._serialized_start=4408
  _globals['_ADDCHAINREQUEST']._serialized_end=4710
  _globals['_ADDCHAINRESPONSE']._serialized_start=4712
  _globals['_ADDCHAINRESPONSE']._serialized_end=4730
  _globals['_RETRYFAILEDEVENTREQUEST']._serialized_start=4733
  _globals['_RETRYFAILEDEVENTREQUEST']._serialized_end=4981
  _globals['_RETRYFAILEDEVENTRESPONSE']._serialized_start=4983
  _globals['_RETRYFAILEDEVENTRESPONSE']._serialized_end=5009
# @@protoc_insertion_point(module_scope)
