# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/tokenmint/v1beta1/mint.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#comdex/tokenmint/v1beta1/mint.proto\x12\x18\x63omdex.tokenmint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xa5\x01\n\tTokenMint\x12\x31\n\x06\x61pp_id\x18\x01 \x01(\x04\x42\x1a\xe2\xde\x1f\x05\x41ppId\xf2\xde\x1f\ryaml:\"app_id\"R\x05\x61ppId\x12\x65\n\rminted_tokens\x18\x02 \x03(\x0b\x32&.comdex.tokenmint.v1beta1.MintedTokensB\x18\xf2\xde\x1f\x14yaml:\"minted_tokens\"R\x0cmintedTokens\"\xf8\x02\n\x0cMintedTokens\x12.\n\x08\x61sset_id\x18\x01 \x01(\x04\x42\x13\xf2\xde\x1f\x0fyaml:\"asset_id\"R\x07\x61ssetId\x12n\n\x0egenesis_supply\x18\x02 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x15yaml:\"genesis_supply\"R\rgenesisSupply\x12X\n\ncreated_at\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"created_at\"\x90\xdf\x1f\x01R\tcreatedAt\x12n\n\x0e\x63urrent_supply\x18\x04 \x01(\tBG\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x15yaml:\"current_supply\"R\rcurrentSupplyB\xe8\x01\n\x1c\x63om.comdex.tokenmint.v1beta1B\tMintProtoP\x01Z3github.com/comdex-official/comdex/x/tokenmint/types\xa2\x02\x03\x43TX\xaa\x02\x18\x43omdex.Tokenmint.V1beta1\xca\x02\x18\x43omdex\\Tokenmint\\V1beta1\xe2\x02$Comdex\\Tokenmint\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Tokenmint::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.tokenmint.v1beta1.mint_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.comdex.tokenmint.v1beta1B\tMintProtoP\001Z3github.com/comdex-official/comdex/x/tokenmint/types\242\002\003CTX\252\002\030Comdex.Tokenmint.V1beta1\312\002\030Comdex\\Tokenmint\\V1beta1\342\002$Comdex\\Tokenmint\\V1beta1\\GPBMetadata\352\002\032Comdex::Tokenmint::V1beta1\310\341\036\000\250\342\036\000'
  _TOKENMINT.fields_by_name['app_id']._options = None
  _TOKENMINT.fields_by_name['app_id']._serialized_options = b'\342\336\037\005AppId\362\336\037\ryaml:\"app_id\"'
  _TOKENMINT.fields_by_name['minted_tokens']._options = None
  _TOKENMINT.fields_by_name['minted_tokens']._serialized_options = b'\362\336\037\024yaml:\"minted_tokens\"'
  _MINTEDTOKENS.fields_by_name['asset_id']._options = None
  _MINTEDTOKENS.fields_by_name['asset_id']._serialized_options = b'\362\336\037\017yaml:\"asset_id\"'
  _MINTEDTOKENS.fields_by_name['genesis_supply']._options = None
  _MINTEDTOKENS.fields_by_name['genesis_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\025yaml:\"genesis_supply\"'
  _MINTEDTOKENS.fields_by_name['created_at']._options = None
  _MINTEDTOKENS.fields_by_name['created_at']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"created_at\"\220\337\037\001'
  _MINTEDTOKENS.fields_by_name['current_supply']._options = None
  _MINTEDTOKENS.fields_by_name['current_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\025yaml:\"current_supply\"'
  _globals['_TOKENMINT']._serialized_start=121
  _globals['_TOKENMINT']._serialized_end=286
  _globals['_MINTEDTOKENS']._serialized_start=289
  _globals['_MINTEDTOKENS']._serialized_end=665
# @@protoc_insertion_point(module_scope)
