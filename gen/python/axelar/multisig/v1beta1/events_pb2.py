# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/multisig/v1beta1/events.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$axelar/multisig/v1beta1/events.proto\x12\x17\x61xelar.multisig.v1beta1\x1a\x14gogoproto/gogo.proto\"\xe2\x01\n\rKeygenStarted\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12\x62\n\x06key_id\x18\x02 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\x12U\n\x0cparticipants\x18\x03 \x03(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.ValAddressR\x0cparticipants\"\x93\x01\n\x0fKeygenCompleted\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12\x62\n\x06key_id\x18\x02 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId:\x04\x88\xa2\x1f\x01\"\x91\x01\n\rKeygenExpired\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12\x62\n\x06key_id\x18\x02 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId:\x04\x88\xa2\x1f\x01\"\xc3\x02\n\x0fPubKeySubmitted\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12\x62\n\x06key_id\x18\x02 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\x12S\n\x0bparticipant\x18\x03 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.ValAddressR\x0bparticipant\x12_\n\x07pub_key\x18\x04 \x01(\x0c\x42\x46\xfa\xde\x1f\x42github.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKeyR\x06pubKey\"\x9d\x04\n\x0eSigningStarted\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12 \n\x06sig_id\x18\x02 \x01(\x04\x42\t\xe2\xde\x1f\x05SigIDR\x05sigId\x12\x62\n\x06key_id\x18\x03 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\x12\x97\x01\n\x08pub_keys\x18\x04 \x03(\x0b\x32\x34.axelar.multisig.v1beta1.SigningStarted.PubKeysEntryBF\x8a\xdf\x1f\x42github.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKeyR\x07pubKeys\x12\x64\n\x0cpayload_hash\x18\x05 \x01(\x0c\x42\x41\xfa\xde\x1f=github.com/axelarnetwork/axelar-core/x/multisig/exported.HashR\x0bpayloadHash\x12+\n\x11requesting_module\x18\x06 \x01(\tR\x10requestingModule\x1a:\n\x0cPubKeysEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x0cR\x05value:\x02\x38\x01:\x04\x98\xa1\x1f\x01\"L\n\x10SigningCompleted\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12 \n\x06sig_id\x18\x02 \x01(\x04\x42\t\xe2\xde\x1f\x05SigIDR\x05sigId\"J\n\x0eSigningExpired\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12 \n\x06sig_id\x18\x02 \x01(\x04\x42\t\xe2\xde\x1f\x05SigIDR\x05sigId\"\xd0\x01\n\x12SignatureSubmitted\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12 \n\x06sig_id\x18\x02 \x01(\x04\x42\t\xe2\xde\x1f\x05SigIDR\x05sigId\x12S\n\x0bparticipant\x18\x03 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.ValAddressR\x0bparticipant\x12+\n\tsignature\x18\x04 \x01(\x0c\x42\r\xfa\xde\x1f\tSignatureR\tsignature\"\xe4\x01\n\x0bKeyAssigned\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x62\n\x06key_id\x18\x03 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\"\xe3\x01\n\nKeyRotated\x12\x16\n\x06module\x18\x01 \x01(\tR\x06module\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x62\n\x06key_id\x18\x03 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\"c\n\x0cKeygenOptOut\x12S\n\x0bparticipant\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x0bparticipant\"b\n\x0bKeygenOptIn\x12S\n\x0bparticipant\x18\x01 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x0bparticipantB\xdf\x01\n\x1b\x63om.axelar.multisig.v1beta1B\x0b\x45ventsProtoP\x01Z5github.com/axelarnetwork/axelar-core/x/multisig/types\xa2\x02\x03\x41MX\xaa\x02\x17\x41xelar.Multisig.V1beta1\xca\x02\x17\x41xelar\\Multisig\\V1beta1\xe2\x02#Axelar\\Multisig\\V1beta1\\GPBMetadata\xea\x02\x19\x41xelar::Multisig::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.multisig.v1beta1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.axelar.multisig.v1beta1B\013EventsProtoP\001Z5github.com/axelarnetwork/axelar-core/x/multisig/types\242\002\003AMX\252\002\027Axelar.Multisig.V1beta1\312\002\027Axelar\\Multisig\\V1beta1\342\002#Axelar\\Multisig\\V1beta1\\GPBMetadata\352\002\031Axelar::Multisig::V1beta1'
  _KEYGENSTARTED.fields_by_name['key_id']._options = None
  _KEYGENSTARTED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _KEYGENSTARTED.fields_by_name['participants']._options = None
  _KEYGENSTARTED.fields_by_name['participants']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.ValAddress'
  _KEYGENCOMPLETED.fields_by_name['key_id']._options = None
  _KEYGENCOMPLETED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _KEYGENCOMPLETED._options = None
  _KEYGENCOMPLETED._serialized_options = b'\210\242\037\001'
  _KEYGENEXPIRED.fields_by_name['key_id']._options = None
  _KEYGENEXPIRED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _KEYGENEXPIRED._options = None
  _KEYGENEXPIRED._serialized_options = b'\210\242\037\001'
  _PUBKEYSUBMITTED.fields_by_name['key_id']._options = None
  _PUBKEYSUBMITTED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _PUBKEYSUBMITTED.fields_by_name['participant']._options = None
  _PUBKEYSUBMITTED.fields_by_name['participant']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.ValAddress'
  _PUBKEYSUBMITTED.fields_by_name['pub_key']._options = None
  _PUBKEYSUBMITTED.fields_by_name['pub_key']._serialized_options = b'\372\336\037Bgithub.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKey'
  _SIGNINGSTARTED_PUBKEYSENTRY._options = None
  _SIGNINGSTARTED_PUBKEYSENTRY._serialized_options = b'8\001'
  _SIGNINGSTARTED.fields_by_name['sig_id']._options = None
  _SIGNINGSTARTED.fields_by_name['sig_id']._serialized_options = b'\342\336\037\005SigID'
  _SIGNINGSTARTED.fields_by_name['key_id']._options = None
  _SIGNINGSTARTED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _SIGNINGSTARTED.fields_by_name['pub_keys']._options = None
  _SIGNINGSTARTED.fields_by_name['pub_keys']._serialized_options = b'\212\337\037Bgithub.com/axelarnetwork/axelar-core/x/multisig/exported.PublicKey'
  _SIGNINGSTARTED.fields_by_name['payload_hash']._options = None
  _SIGNINGSTARTED.fields_by_name['payload_hash']._serialized_options = b'\372\336\037=github.com/axelarnetwork/axelar-core/x/multisig/exported.Hash'
  _SIGNINGSTARTED._options = None
  _SIGNINGSTARTED._serialized_options = b'\230\241\037\001'
  _SIGNINGCOMPLETED.fields_by_name['sig_id']._options = None
  _SIGNINGCOMPLETED.fields_by_name['sig_id']._serialized_options = b'\342\336\037\005SigID'
  _SIGNINGEXPIRED.fields_by_name['sig_id']._options = None
  _SIGNINGEXPIRED.fields_by_name['sig_id']._serialized_options = b'\342\336\037\005SigID'
  _SIGNATURESUBMITTED.fields_by_name['sig_id']._options = None
  _SIGNATURESUBMITTED.fields_by_name['sig_id']._serialized_options = b'\342\336\037\005SigID'
  _SIGNATURESUBMITTED.fields_by_name['participant']._options = None
  _SIGNATURESUBMITTED.fields_by_name['participant']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.ValAddress'
  _SIGNATURESUBMITTED.fields_by_name['signature']._options = None
  _SIGNATURESUBMITTED.fields_by_name['signature']._serialized_options = b'\372\336\037\tSignature'
  _KEYASSIGNED.fields_by_name['chain']._options = None
  _KEYASSIGNED.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _KEYASSIGNED.fields_by_name['key_id']._options = None
  _KEYASSIGNED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _KEYROTATED.fields_by_name['chain']._options = None
  _KEYROTATED.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _KEYROTATED.fields_by_name['key_id']._options = None
  _KEYROTATED.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _KEYGENOPTOUT.fields_by_name['participant']._options = None
  _KEYGENOPTOUT.fields_by_name['participant']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _KEYGENOPTIN.fields_by_name['participant']._options = None
  _KEYGENOPTIN.fields_by_name['participant']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _globals['_KEYGENSTARTED']._serialized_start=88
  _globals['_KEYGENSTARTED']._serialized_end=314
  _globals['_KEYGENCOMPLETED']._serialized_start=317
  _globals['_KEYGENCOMPLETED']._serialized_end=464
  _globals['_KEYGENEXPIRED']._serialized_start=467
  _globals['_KEYGENEXPIRED']._serialized_end=612
  _globals['_PUBKEYSUBMITTED']._serialized_start=615
  _globals['_PUBKEYSUBMITTED']._serialized_end=938
  _globals['_SIGNINGSTARTED']._serialized_start=941
  _globals['_SIGNINGSTARTED']._serialized_end=1482
  _globals['_SIGNINGSTARTED_PUBKEYSENTRY']._serialized_start=1418
  _globals['_SIGNINGSTARTED_PUBKEYSENTRY']._serialized_end=1476
  _globals['_SIGNINGCOMPLETED']._serialized_start=1484
  _globals['_SIGNINGCOMPLETED']._serialized_end=1560
  _globals['_SIGNINGEXPIRED']._serialized_start=1562
  _globals['_SIGNINGEXPIRED']._serialized_end=1636
  _globals['_SIGNATURESUBMITTED']._serialized_start=1639
  _globals['_SIGNATURESUBMITTED']._serialized_end=1847
  _globals['_KEYASSIGNED']._serialized_start=1850
  _globals['_KEYASSIGNED']._serialized_end=2078
  _globals['_KEYROTATED']._serialized_start=2081
  _globals['_KEYROTATED']._serialized_end=2308
  _globals['_KEYGENOPTOUT']._serialized_start=2310
  _globals['_KEYGENOPTOUT']._serialized_end=2409
  _globals['_KEYGENOPTIN']._serialized_start=2411
  _globals['_KEYGENOPTIN']._serialized_end=2509
# @@protoc_insertion_point(module_scope)
