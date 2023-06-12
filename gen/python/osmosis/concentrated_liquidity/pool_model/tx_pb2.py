# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/concentrated-liquidity/pool-model/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n2osmosis/concentrated-liquidity/pool-model/tx.proto\x12+osmosis.concentratedliquidity.v1beta1.model\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xc5\x02\n\x19MsgCreateConcentratedPool\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12)\n\x06\x64\x65nom0\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"denom0\"R\x06\x64\x65nom0\x12)\n\x06\x64\x65nom1\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"denom1\"R\x06\x64\x65nom1\x12:\n\x0ctick_spacing\x18\x04 \x01(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"tick_spacing\"R\x0btickSpacing\x12k\n\rspread_factor\x18\x05 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x14yaml:\"spread_factor\"R\x0cspreadFactor\"H\n!MsgCreateConcentratedPoolResponse\x12#\n\x07pool_id\x18\x01 \x01(\x04\x42\n\xe2\xde\x1f\x06PoolIDR\x06poolId2\xbf\x01\n\nMsgCreator\x12\xb0\x01\n\x16\x43reateConcentratedPool\x12\x46.osmosis.concentratedliquidity.v1beta1.model.MsgCreateConcentratedPool\x1aN.osmosis.concentratedliquidity.v1beta1.model.MsgCreateConcentratedPoolResponseB\xce\x02\n/com.osmosis.concentratedliquidity.v1beta1.modelB\x07TxProtoP\x01ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/model\xa2\x02\x04OCVM\xaa\x02+Osmosis.Concentratedliquidity.V1beta1.Model\xca\x02+Osmosis\\Concentratedliquidity\\V1beta1\\Model\xe2\x02\x37Osmosis\\Concentratedliquidity\\V1beta1\\Model\\GPBMetadata\xea\x02.Osmosis::Concentratedliquidity::V1beta1::Modelb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.concentrated_liquidity.pool_model.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n/com.osmosis.concentratedliquidity.v1beta1.modelB\007TxProtoP\001ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/model\242\002\004OCVM\252\002+Osmosis.Concentratedliquidity.V1beta1.Model\312\002+Osmosis\\Concentratedliquidity\\V1beta1\\Model\342\0027Osmosis\\Concentratedliquidity\\V1beta1\\Model\\GPBMetadata\352\002.Osmosis::Concentratedliquidity::V1beta1::Model'
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['sender']._options = None
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['denom0']._options = None
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['denom0']._serialized_options = b'\362\336\037\ryaml:\"denom0\"'
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['denom1']._options = None
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['denom1']._serialized_options = b'\362\336\037\ryaml:\"denom1\"'
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['tick_spacing']._options = None
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['tick_spacing']._serialized_options = b'\362\336\037\023yaml:\"tick_spacing\"'
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['spread_factor']._options = None
  _MSGCREATECONCENTRATEDPOOL.fields_by_name['spread_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\024yaml:\"spread_factor\"'
  _MSGCREATECONCENTRATEDPOOLRESPONSE.fields_by_name['pool_id']._options = None
  _MSGCREATECONCENTRATEDPOOLRESPONSE.fields_by_name['pool_id']._serialized_options = b'\342\336\037\006PoolID'
  _globals['_MSGCREATECONCENTRATEDPOOL']._serialized_start=154
  _globals['_MSGCREATECONCENTRATEDPOOL']._serialized_end=479
  _globals['_MSGCREATECONCENTRATEDPOOLRESPONSE']._serialized_start=481
  _globals['_MSGCREATECONCENTRATEDPOOLRESPONSE']._serialized_end=553
  _globals['_MSGCREATOR']._serialized_start=556
  _globals['_MSGCREATOR']._serialized_end=747
# @@protoc_insertion_point(module_scope)
