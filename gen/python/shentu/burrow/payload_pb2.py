# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shentu/burrow/payload.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from shentu.burrow import permission_pb2 as shentu_dot_burrow_dot_permission__pb2
from shentu.burrow import registry_pb2 as shentu_dot_burrow_dot_registry__pb2
from shentu.burrow import spec_pb2 as shentu_dot_burrow_dot_spec__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bshentu/burrow/payload.proto\x12\x07payload\x1a\x14gogoproto/gogo.proto\x1a\x1eshentu/burrow/permission.proto\x1a\x1cshentu/burrow/registry.proto\x1a\x18shentu/burrow/spec.proto\"\xc6\x03\n\x03\x41ny\x12\'\n\x06\x43\x61llTx\x18\x01 \x01(\x0b\x32\x0f.payload.CallTxR\x06\x43\x61llTx\x12\'\n\x06SendTx\x18\x02 \x01(\x0b\x32\x0f.payload.SendTxR\x06SendTx\x12\'\n\x06NameTx\x18\x03 \x01(\x0b\x32\x0f.payload.NameTxR\x06NameTx\x12*\n\x07PermsTx\x18\x04 \x01(\x0b\x32\x10.payload.PermsTxR\x07PermsTx\x12$\n\x05GovTx\x18\x05 \x01(\x0b\x32\x0e.payload.GovTxR\x05GovTx\x12\'\n\x06\x42ondTx\x18\x06 \x01(\x0b\x32\x0f.payload.BondTxR\x06\x42ondTx\x12-\n\x08UnbondTx\x18\x07 \x01(\x0b\x32\x11.payload.UnbondTxR\x08UnbondTx\x12*\n\x07\x42\x61tchTx\x18\x08 \x01(\x0b\x32\x10.payload.BatchTxR\x07\x42\x61tchTx\x12\x33\n\nProposalTx\x18\t \x01(\x0b\x32\x13.payload.ProposalTxR\nProposalTx\x12\x33\n\nIdentifyTx\x18\n \x01(\x0b\x32\x13.payload.IdentifyTxR\nIdentifyTx:\x04\xc8\xa0\x1f\x01\"\x93\x01\n\x07TxInput\x12N\n\x07\x41\x64\x64ress\x18\x01 \x01(\x0c\x42\x34\xc8\xde\x1f\x00\xda\xde\x1f,github.com/hyperledger/burrow/crypto.AddressR\x07\x41\x64\x64ress\x12\x16\n\x06\x41mount\x18\x02 \x01(\x04R\x06\x41mount\x12\x1a\n\x08Sequence\x18\x03 \x01(\x04R\x08Sequence:\x04\x98\xa0\x1f\x00\"x\n\x08TxOutput\x12N\n\x07\x41\x64\x64ress\x18\x01 \x01(\x0c\x42\x34\xc8\xde\x1f\x00\xda\xde\x1f,github.com/hyperledger/burrow/crypto.AddressR\x07\x41\x64\x64ress\x12\x16\n\x06\x41mount\x18\x02 \x01(\x04R\x06\x41mount:\x04\x98\xa0\x1f\x00\"\xaf\x03\n\x06\x43\x61llTx\x12&\n\x05Input\x18\x01 \x01(\x0b\x32\x10.payload.TxInputR\x05Input\x12J\n\x07\x41\x64\x64ress\x18\x02 \x01(\x0c\x42\x30\xda\xde\x1f,github.com/hyperledger/burrow/crypto.AddressR\x07\x41\x64\x64ress\x12\x1a\n\x08GasLimit\x18\x03 \x01(\x04R\x08GasLimit\x12\x10\n\x03\x46\x65\x65\x18\x04 \x01(\x04R\x03\x46\x65\x65\x12I\n\x04\x44\x61ta\x18\x05 \x01(\x0c\x42\x35\xc8\xde\x1f\x00\xda\xde\x1f-github.com/hyperledger/burrow/binary.HexBytesR\x04\x44\x61ta\x12[\n\x04WASM\x18\x06 \x01(\x0c\x42G\xc8\xde\x1f\x00\xda\xde\x1f-github.com/hyperledger/burrow/binary.HexBytes\xea\xde\x1f\x0etags,omitemptyR\x04WASM\x12\x39\n\x0c\x43ontractMeta\x18\x07 \x03(\x0b\x32\x15.payload.ContractMetaR\x0c\x43ontractMeta\x12\x1a\n\x08GasPrice\x18\x08 \x01(\x04R\x08GasPrice:\x04\x98\xa0\x1f\x00\"u\n\x0c\x43ontractMeta\x12Q\n\x08\x43odeHash\x18\x01 \x01(\x0c\x42\x35\xc8\xde\x1f\x00\xda\xde\x1f-github.com/hyperledger/burrow/binary.HexBytesR\x08\x43odeHash\x12\x12\n\x04Meta\x18\x02 \x01(\tR\x04Meta\"i\n\x06SendTx\x12(\n\x06Inputs\x18\x01 \x03(\x0b\x32\x10.payload.TxInputR\x06Inputs\x12+\n\x07Outputs\x18\x02 \x03(\x0b\x32\x11.payload.TxOutputR\x07Outputs:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"o\n\x07PermsTx\x12&\n\x05Input\x18\x01 \x01(\x0b\x32\x10.payload.TxInputR\x05Input\x12\x36\n\x08PermArgs\x18\x02 \x01(\x0b\x32\x14.permission.PermArgsB\x04\xc8\xde\x1f\x00R\x08PermArgs:\x04\x98\xa0\x1f\x00\"p\n\x06NameTx\x12&\n\x05Input\x18\x01 \x01(\x0b\x32\x10.payload.TxInputR\x05Input\x12\x12\n\x04Name\x18\x02 \x01(\tR\x04Name\x12\x12\n\x04\x44\x61ta\x18\x03 \x01(\tR\x04\x44\x61ta\x12\x10\n\x03\x46\x65\x65\x18\x04 \x01(\x04R\x03\x46\x65\x65:\x04\x98\xa0\x1f\x00\":\n\x06\x42ondTx\x12&\n\x05Input\x18\x01 \x01(\x0b\x32\x10.payload.TxInputR\x05Input:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"g\n\x08UnbondTx\x12&\n\x05Input\x18\x01 \x01(\x0b\x32\x10.payload.TxInputR\x05Input\x12)\n\x06Output\x18\x02 \x01(\x0b\x32\x11.payload.TxOutputR\x06Output:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\x80\x01\n\x05GovTx\x12(\n\x06Inputs\x18\x01 \x03(\x0b\x32\x10.payload.TxInputR\x06Inputs\x12\x43\n\x0e\x41\x63\x63ountUpdates\x18\x02 \x03(\x0b\x32\x15.spec.TemplateAccountB\x04\xc8\xde\x1f\x01R\x0e\x41\x63\x63ountUpdates:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\xe8\x01\n\nProposalTx\x12&\n\x05Input\x18\x01 \x01(\x0b\x32\x10.payload.TxInputR\x05Input\x12\"\n\x0cVotingWeight\x18\x02 \x01(\x03R\x0cVotingWeight\x12U\n\x0cProposalHash\x18\x03 \x01(\x0c\x42\x31\xda\xde\x1f-github.com/hyperledger/burrow/binary.HexBytesR\x0cProposalHash\x12-\n\x08Proposal\x18\x04 \x01(\x0b\x32\x11.payload.ProposalR\x08Proposal:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"l\n\nIdentifyTx\x12(\n\x06Inputs\x18\x01 \x03(\x0b\x32\x10.payload.TxInputR\x06Inputs\x12*\n\x04Node\x18\x02 \x01(\x0b\x32\x16.registry.NodeIdentityR\x04Node:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"]\n\x07\x42\x61tchTx\x12(\n\x06Inputs\x18\x01 \x03(\x0b\x32\x10.payload.TxInputR\x06Inputs\x12\x1e\n\x03Txs\x18\x02 \x03(\x0b\x32\x0c.payload.AnyR\x03Txs:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\x84\x01\n\x04Vote\x12N\n\x07\x41\x64\x64ress\x18\x01 \x01(\x0c\x42\x34\xc8\xde\x1f\x00\xda\xde\x1f,github.com/hyperledger/burrow/crypto.AddressR\x07\x41\x64\x64ress\x12\"\n\x0cVotingWeight\x18\x02 \x01(\x03R\x0cVotingWeight:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"v\n\x08Proposal\x12\x12\n\x04Name\x18\x01 \x01(\tR\x04Name\x12 \n\x0b\x44\x65scription\x18\x02 \x01(\tR\x0b\x44\x65scription\x12*\n\x07\x42\x61tchTx\x18\x03 \x01(\x0b\x32\x10.payload.BatchTxR\x07\x42\x61tchTx:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\xb1\x02\n\x06\x42\x61llot\x12-\n\x08Proposal\x18\x01 \x01(\x0b\x32\x11.payload.ProposalR\x08Proposal\x12U\n\x0c\x46inalizingTx\x18\x02 \x01(\x0c\x42\x31\xda\xde\x1f-github.com/hyperledger/burrow/binary.HexBytesR\x0c\x46inalizingTx\x12\x43\n\rproposalState\x18\x04 \x01(\x0e\x32\x1d.payload.Ballot.ProposalStateR\rproposalState\x12#\n\x05Votes\x18\x05 \x03(\x0b\x32\r.payload.VoteR\x05Votes\"7\n\rProposalState\x12\x0c\n\x08PROPOSED\x10\x00\x12\x0c\n\x08\x45XECUTED\x10\x01\x12\n\n\x06\x46\x41ILED\x10\x02\x42\x96\x01\n\x0b\x63om.payloadB\x0cPayloadProtoP\x01Z)github.com/hyperledger/burrow/txs/payload\xa2\x02\x03PXX\xaa\x02\x07Payload\xca\x02\x07Payload\xe2\x02\x13Payload\\GPBMetadata\xea\x02\x07Payload\xc8\xe2\x1e\x01\xd0\xe2\x1e\x01\xe0\xe2\x1e\x01\xc0\xe3\x1e\x01\xc8\xe3\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shentu.burrow.payload_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\013com.payloadB\014PayloadProtoP\001Z)github.com/hyperledger/burrow/txs/payload\242\002\003PXX\252\002\007Payload\312\002\007Payload\342\002\023Payload\\GPBMetadata\352\002\007Payload\310\342\036\001\320\342\036\001\340\342\036\001\300\343\036\001\310\343\036\001'
  _ANY._options = None
  _ANY._serialized_options = b'\310\240\037\001'
  _TXINPUT.fields_by_name['Address']._options = None
  _TXINPUT.fields_by_name['Address']._serialized_options = b'\310\336\037\000\332\336\037,github.com/hyperledger/burrow/crypto.Address'
  _TXINPUT._options = None
  _TXINPUT._serialized_options = b'\230\240\037\000'
  _TXOUTPUT.fields_by_name['Address']._options = None
  _TXOUTPUT.fields_by_name['Address']._serialized_options = b'\310\336\037\000\332\336\037,github.com/hyperledger/burrow/crypto.Address'
  _TXOUTPUT._options = None
  _TXOUTPUT._serialized_options = b'\230\240\037\000'
  _CALLTX.fields_by_name['Address']._options = None
  _CALLTX.fields_by_name['Address']._serialized_options = b'\332\336\037,github.com/hyperledger/burrow/crypto.Address'
  _CALLTX.fields_by_name['Data']._options = None
  _CALLTX.fields_by_name['Data']._serialized_options = b'\310\336\037\000\332\336\037-github.com/hyperledger/burrow/binary.HexBytes'
  _CALLTX.fields_by_name['WASM']._options = None
  _CALLTX.fields_by_name['WASM']._serialized_options = b'\310\336\037\000\332\336\037-github.com/hyperledger/burrow/binary.HexBytes\352\336\037\016tags,omitempty'
  _CALLTX._options = None
  _CALLTX._serialized_options = b'\230\240\037\000'
  _CONTRACTMETA.fields_by_name['CodeHash']._options = None
  _CONTRACTMETA.fields_by_name['CodeHash']._serialized_options = b'\310\336\037\000\332\336\037-github.com/hyperledger/burrow/binary.HexBytes'
  _SENDTX._options = None
  _SENDTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _PERMSTX.fields_by_name['PermArgs']._options = None
  _PERMSTX.fields_by_name['PermArgs']._serialized_options = b'\310\336\037\000'
  _PERMSTX._options = None
  _PERMSTX._serialized_options = b'\230\240\037\000'
  _NAMETX._options = None
  _NAMETX._serialized_options = b'\230\240\037\000'
  _BONDTX._options = None
  _BONDTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _UNBONDTX._options = None
  _UNBONDTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _GOVTX.fields_by_name['AccountUpdates']._options = None
  _GOVTX.fields_by_name['AccountUpdates']._serialized_options = b'\310\336\037\001'
  _GOVTX._options = None
  _GOVTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _PROPOSALTX.fields_by_name['ProposalHash']._options = None
  _PROPOSALTX.fields_by_name['ProposalHash']._serialized_options = b'\332\336\037-github.com/hyperledger/burrow/binary.HexBytes'
  _PROPOSALTX._options = None
  _PROPOSALTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _IDENTIFYTX._options = None
  _IDENTIFYTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _BATCHTX._options = None
  _BATCHTX._serialized_options = b'\210\240\037\000\230\240\037\000'
  _VOTE.fields_by_name['Address']._options = None
  _VOTE.fields_by_name['Address']._serialized_options = b'\310\336\037\000\332\336\037,github.com/hyperledger/burrow/crypto.Address'
  _VOTE._options = None
  _VOTE._serialized_options = b'\210\240\037\000\230\240\037\000'
  _PROPOSAL._options = None
  _PROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000'
  _BALLOT.fields_by_name['FinalizingTx']._options = None
  _BALLOT.fields_by_name['FinalizingTx']._serialized_options = b'\332\336\037-github.com/hyperledger/burrow/binary.HexBytes'
  _globals['_ANY']._serialized_start=151
  _globals['_ANY']._serialized_end=605
  _globals['_TXINPUT']._serialized_start=608
  _globals['_TXINPUT']._serialized_end=755
  _globals['_TXOUTPUT']._serialized_start=757
  _globals['_TXOUTPUT']._serialized_end=877
  _globals['_CALLTX']._serialized_start=880
  _globals['_CALLTX']._serialized_end=1311
  _globals['_CONTRACTMETA']._serialized_start=1313
  _globals['_CONTRACTMETA']._serialized_end=1430
  _globals['_SENDTX']._serialized_start=1432
  _globals['_SENDTX']._serialized_end=1537
  _globals['_PERMSTX']._serialized_start=1539
  _globals['_PERMSTX']._serialized_end=1650
  _globals['_NAMETX']._serialized_start=1652
  _globals['_NAMETX']._serialized_end=1764
  _globals['_BONDTX']._serialized_start=1766
  _globals['_BONDTX']._serialized_end=1824
  _globals['_UNBONDTX']._serialized_start=1826
  _globals['_UNBONDTX']._serialized_end=1929
  _globals['_GOVTX']._serialized_start=1932
  _globals['_GOVTX']._serialized_end=2060
  _globals['_PROPOSALTX']._serialized_start=2063
  _globals['_PROPOSALTX']._serialized_end=2295
  _globals['_IDENTIFYTX']._serialized_start=2297
  _globals['_IDENTIFYTX']._serialized_end=2405
  _globals['_BATCHTX']._serialized_start=2407
  _globals['_BATCHTX']._serialized_end=2500
  _globals['_VOTE']._serialized_start=2503
  _globals['_VOTE']._serialized_end=2635
  _globals['_PROPOSAL']._serialized_start=2637
  _globals['_PROPOSAL']._serialized_end=2755
  _globals['_BALLOT']._serialized_start=2758
  _globals['_BALLOT']._serialized_end=3063
  _globals['_BALLOT_PROPOSALSTATE']._serialized_start=3008
  _globals['_BALLOT_PROPOSALSTATE']._serialized_end=3063
# @@protoc_insertion_point(module_scope)
