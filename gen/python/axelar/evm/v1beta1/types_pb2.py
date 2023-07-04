# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/evm/v1beta1/types.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from axelar.nexus.exported.v1beta1 import types_pb2 as axelar_dot_nexus_dot_exported_dot_v1beta1_dot_types__pb2
from axelar.multisig.exported.v1beta1 import types_pb2 as axelar_dot_multisig_dot_exported_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x61xelar/evm/v1beta1/types.proto\x12\x12\x61xelar.evm.v1beta1\x1a\x19google/protobuf/any.proto\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a)axelar/nexus/exported/v1beta1/types.proto\x1a,axelar/multisig/exported/v1beta1/types.proto\"\xa0\x01\n\nVoteEvents\x12Y\n\x05\x63hain\x18\x01 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x37\n\x06\x65vents\x18\x02 \x03(\x0b\x32\x19.axelar.evm.v1beta1.EventB\x04\xc8\xde\x1f\x00R\x06\x65vents\"\xca\x08\n\x05\x45vent\x12Y\n\x05\x63hain\x18\x01 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x05tx_id\x18\x02 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId\x12\x14\n\x05index\x18\x03 \x01(\x04R\x05index\x12\x38\n\x06status\x18\x04 \x01(\x0e\x32 .axelar.evm.v1beta1.Event.StatusR\x06status\x12\x43\n\ntoken_sent\x18\x05 \x01(\x0b\x32\".axelar.evm.v1beta1.EventTokenSentH\x00R\ttokenSent\x12L\n\rcontract_call\x18\x06 \x01(\x0b\x32%.axelar.evm.v1beta1.EventContractCallH\x00R\x0c\x63ontractCall\x12i\n\x18\x63ontract_call_with_token\x18\x07 \x01(\x0b\x32..axelar.evm.v1beta1.EventContractCallWithTokenH\x00R\x15\x63ontractCallWithToken\x12?\n\x08transfer\x18\x08 \x01(\x0b\x32!.axelar.evm.v1beta1.EventTransferH\x00R\x08transfer\x12O\n\x0etoken_deployed\x18\t \x01(\x0b\x32&.axelar.evm.v1beta1.EventTokenDeployedH\x00R\rtokenDeployed\x12\x81\x01\n\x1emultisig_ownership_transferred\x18\n \x01(\x0b\x32\x35.axelar.evm.v1beta1.EventMultisigOwnershipTransferredB\x02\x18\x01H\x00R\x1cmultisigOwnershipTransferred\x12\x86\x01\n!multisig_operatorship_transferred\x18\x0b \x01(\x0b\x32\x38.axelar.evm.v1beta1.EventMultisigOperatorshipTransferredH\x00R\x1fmultisigOperatorshipTransferred\"\xb8\x01\n\x06Status\x12,\n\x12STATUS_UNSPECIFIED\x10\x00\x1a\x14\x8a\x9d \x10\x45ventNonExistent\x12(\n\x10STATUS_CONFIRMED\x10\x01\x1a\x12\x8a\x9d \x0e\x45ventConfirmed\x12(\n\x10STATUS_COMPLETED\x10\x02\x1a\x12\x8a\x9d \x0e\x45ventCompleted\x12\"\n\rSTATUS_FAILED\x10\x03\x1a\x0f\x8a\x9d \x0b\x45ventFailed\x1a\x08\x88\xa3\x1e\x00\xa8\xa4\x1e\x01\x42\x07\n\x05\x65ventJ\x04\x08\x0c\x10\rJ\x04\x08\r\x10\x0e\"\xbd\x02\n\x0e\x45ventTokenSent\x12\'\n\x06sender\x18\x01 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x06sender\x12p\n\x11\x64\x65stination_chain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x10\x64\x65stinationChain\x12/\n\x13\x64\x65stination_address\x18\x03 \x01(\tR\x12\x64\x65stinationAddress\x12\x16\n\x06symbol\x18\x04 \x01(\tR\x06symbol\x12G\n\x06\x61mount\x18\x05 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount\"\x8a\x02\n\x11\x45ventContractCall\x12\'\n\x06sender\x18\x01 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x06sender\x12p\n\x11\x64\x65stination_chain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x10\x64\x65stinationChain\x12)\n\x10\x63ontract_address\x18\x03 \x01(\tR\x0f\x63ontractAddress\x12/\n\x0cpayload_hash\x18\x04 \x01(\x0c\x42\x0c\xc8\xde\x1f\x00\xda\xde\x1f\x04HashR\x0bpayloadHash\"\xf4\x02\n\x1a\x45ventContractCallWithToken\x12\'\n\x06sender\x18\x01 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x06sender\x12p\n\x11\x64\x65stination_chain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x10\x64\x65stinationChain\x12)\n\x10\x63ontract_address\x18\x03 \x01(\tR\x0f\x63ontractAddress\x12/\n\x0cpayload_hash\x18\x04 \x01(\x0c\x42\x0c\xc8\xde\x1f\x00\xda\xde\x1f\x04HashR\x0bpayloadHash\x12\x16\n\x06symbol\x18\x05 \x01(\tR\x06symbol\x12G\n\x06\x61mount\x18\x06 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount\"y\n\rEventTransfer\x12\x1f\n\x02to\x18\x01 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x02to\x12G\n\x06\x61mount\x18\x02 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount\"b\n\x12\x45ventTokenDeployed\x12\x16\n\x06symbol\x18\x01 \x01(\tR\x06symbol\x12\x34\n\rtoken_address\x18\x02 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x0ctokenAddress\"\xb5\x02\n!EventMultisigOwnershipTransferred\x12.\n\npre_owners\x18\x01 \x03(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\tpreOwners\x12V\n\x0eprev_threshold\x18\x02 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\rprevThreshold\x12.\n\nnew_owners\x18\x03 \x03(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\tnewOwners\x12T\n\rnew_threshold\x18\x04 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x0cnewThreshold:\x02\x18\x01\"\x90\x02\n$EventMultisigOperatorshipTransferred\x12\x34\n\rnew_operators\x18\x03 \x03(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x0cnewOperators\x12T\n\rnew_threshold\x18\x04 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x0cnewThreshold\x12P\n\x0bnew_weights\x18\x05 \x03(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\nnewWeightsJ\x04\x08\x01\x10\x02J\x04\x08\x02\x10\x03\"a\n\x0bNetworkInfo\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12>\n\x02id\x18\x02 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x02id\"\xbc\x02\n\nBurnerInfo\x12\x36\n\x0e\x62urner_address\x18\x01 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\rburnerAddress\x12\x34\n\rtoken_address\x18\x02 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x0ctokenAddress\x12p\n\x11\x64\x65stination_chain\x18\x03 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x10\x64\x65stinationChain\x12\x16\n\x06symbol\x18\x04 \x01(\tR\x06symbol\x12\x14\n\x05\x61sset\x18\x05 \x01(\tR\x05\x61sset\x12 \n\x04salt\x18\x06 \x01(\x0c\x42\x0c\xc8\xde\x1f\x00\xda\xde\x1f\x04HashR\x04salt\"\xdf\x02\n\x0c\x45RC20Deposit\x12)\n\x05tx_id\x18\x01 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId\x12G\n\x06\x61mount\x18\x02 \x01(\x0c\x42/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.UintR\x06\x61mount\x12\x14\n\x05\x61sset\x18\x03 \x01(\tR\x05\x61sset\x12p\n\x11\x64\x65stination_chain\x18\x04 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x10\x64\x65stinationChain\x12\x36\n\x0e\x62urner_address\x18\x05 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\rburnerAddress\x12\x1b\n\tlog_index\x18\x06 \x01(\x04R\x08logIndex\"\x9b\x03\n\x12\x45RC20TokenMetadata\x12\x14\n\x05\x61sset\x18\x01 \x01(\tR\x05\x61sset\x12T\n\x08\x63hain_id\x18\x02 \x01(\x0c\x42\x39\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xe2\xde\x1f\x07\x43hainIDR\x07\x63hainId\x12@\n\x07\x64\x65tails\x18\x03 \x01(\x0b\x32 .axelar.evm.v1beta1.TokenDetailsB\x04\xc8\xde\x1f\x00R\x07\x64\x65tails\x12\x34\n\rtoken_address\x18\x04 \x01(\tB\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x0ctokenAddress\x12%\n\x07tx_hash\x18\x05 \x01(\tB\x0c\xc8\xde\x1f\x00\xda\xde\x1f\x04HashR\x06txHash\x12\x32\n\x06status\x18\x07 \x01(\x0e\x32\x1a.axelar.evm.v1beta1.StatusR\x06status\x12\x1f\n\x0bis_external\x18\x08 \x01(\x08R\nisExternal\x12\x1f\n\x0b\x62urner_code\x18\t \x01(\x0cR\nburnerCodeJ\x04\x08\x06\x10\x07\"P\n\x13TransactionMetadata\x12 \n\x06raw_tx\x18\x01 \x01(\x0c\x42\t\xe2\xde\x1f\x05RawTXR\x05rawTx\x12\x17\n\x07pub_key\x18\x02 \x01(\x0cR\x06pubKey\"\xa3\x02\n\x07\x43ommand\x12\'\n\x02id\x18\x01 \x01(\x0c\x42\x17\xc8\xde\x1f\x00\xda\xde\x1f\tCommandID\xe2\xde\x1f\x02IDR\x02id\x12\x1c\n\x07\x63ommand\x18\x02 \x01(\tB\x02\x18\x01R\x07\x63ommand\x12\x16\n\x06params\x18\x03 \x01(\x0cR\x06params\x12\x62\n\x06key_id\x18\x04 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\x12 \n\x0cmax_gas_cost\x18\x05 \x01(\rR\nmaxGasCost\x12\x33\n\x04type\x18\x06 \x01(\x0e\x32\x1f.axelar.evm.v1beta1.CommandTypeR\x04type\"\x88\x04\n\x14\x43ommandBatchMetadata\x12\x16\n\x02id\x18\x01 \x01(\x0c\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12@\n\x0b\x63ommand_ids\x18\x02 \x03(\x0c\x42\x1f\xc8\xde\x1f\x00\xda\xde\x1f\tCommandID\xe2\xde\x1f\nCommandIDsR\ncommandIds\x12\x12\n\x04\x64\x61ta\x18\x03 \x01(\x0cR\x04\x64\x61ta\x12\'\n\x08sig_hash\x18\x04 \x01(\x0c\x42\x0c\xc8\xde\x1f\x00\xda\xde\x1f\x04HashR\x07sigHash\x12\x41\n\x06status\x18\x05 \x01(\x0e\x32).axelar.evm.v1beta1.BatchedCommandsStatusR\x06status\x12\x62\n\x06key_id\x18\x06 \x01(\tBK\xe2\xde\x1f\x05KeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\x05keyId\x12R\n\x18prev_batched_commands_id\x18\x07 \x01(\x0c\x42\x19\xe2\xde\x1f\x15PrevBatchedCommandsIDR\x15prevBatchedCommandsId\x12^\n\tsignature\x18\x08 \x01(\x0b\x32\x14.google.protobuf.AnyB*\xca\xb4-&github.com/cosmos/codec/ProtoMarshalerR\tsignature\"\xd7\x01\n\x0bSigMetadata\x12/\n\x04type\x18\x01 \x01(\x0e\x32\x1b.axelar.evm.v1beta1.SigTypeR\x04type\x12Y\n\x05\x63hain\x18\x02 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12<\n\x10\x63ommand_batch_id\x18\x03 \x01(\x0c\x42\x12\xe2\xde\x1f\x0e\x43ommandBatchIDR\x0e\x63ommandBatchId\"\xaf\x01\n\x0bTransferKey\x12)\n\x05tx_id\x18\x01 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId\x12o\n\x0bnext_key_id\x18\x03 \x01(\tBO\xe2\xde\x1f\tNextKeyID\xfa\xde\x1f>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyIDR\tnextKeyIdJ\x04\x08\x02\x10\x03\"v\n\x05\x41sset\x12Y\n\x05\x63hain\x18\x01 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\"\xb8\x01\n\x0cTokenDetails\x12\x1d\n\ntoken_name\x18\x01 \x01(\tR\ttokenName\x12\x16\n\x06symbol\x18\x02 \x01(\tR\x06symbol\x12%\n\x08\x64\x65\x63imals\x18\x03 \x01(\rB\t\xfa\xde\x1f\x05uint8R\x08\x64\x65\x63imals\x12J\n\x08\x63\x61pacity\x18\x04 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08\x63\x61pacity\":\n\x07Gateway\x12)\n\x07\x61\x64\x64ress\x18\x01 \x01(\x0c\x42\x0f\xc8\xde\x1f\x00\xda\xde\x1f\x07\x41\x64\x64ressR\x07\x61\x64\x64ressJ\x04\x08\x02\x10\x03\"\x94\x01\n\x0cPollMetadata\x12Y\n\x05\x63hain\x18\x01 \x01(\tBC\xfa\xde\x1f?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainNameR\x05\x63hain\x12)\n\x05tx_id\x18\x02 \x01(\x0c\x42\x14\xc8\xde\x1f\x00\xda\xde\x1f\x04Hash\xe2\xde\x1f\x04TxIDR\x04txId*\xaa\x01\n\x06Status\x12\'\n\x12STATUS_UNSPECIFIED\x10\x00\x1a\x0f\x8a\x9d \x0bNonExistent\x12\'\n\x12STATUS_INITIALIZED\x10\x01\x1a\x0f\x8a\x9d \x0bInitialized\x12\x1f\n\x0eSTATUS_PENDING\x10\x02\x1a\x0b\x8a\x9d \x07Pending\x12#\n\x10STATUS_CONFIRMED\x10\x04\x1a\r\x8a\x9d \tConfirmed\x1a\x08\x88\xa3\x1e\x00\xa8\xa4\x1e\x01*\x90\x02\n\x0b\x43ommandType\x12\x1c\n\x18\x43OMMAND_TYPE_UNSPECIFIED\x10\x00\x12\x1b\n\x17\x43OMMAND_TYPE_MINT_TOKEN\x10\x01\x12\x1d\n\x19\x43OMMAND_TYPE_DEPLOY_TOKEN\x10\x02\x12\x1b\n\x17\x43OMMAND_TYPE_BURN_TOKEN\x10\x03\x12&\n\"COMMAND_TYPE_TRANSFER_OPERATORSHIP\x10\x04\x12\x30\n,COMMAND_TYPE_APPROVE_CONTRACT_CALL_WITH_MINT\x10\x05\x12&\n\"COMMAND_TYPE_APPROVE_CONTRACT_CALL\x10\x06\x1a\x08\x88\xa3\x1e\x00\xa8\xa4\x1e\x00*\xff\x01\n\x15\x42\x61tchedCommandsStatus\x12=\n#BATCHED_COMMANDS_STATUS_UNSPECIFIED\x10\x00\x1a\x14\x8a\x9d \x10\x42\x61tchNonExistent\x12\x35\n\x1f\x42\x41TCHED_COMMANDS_STATUS_SIGNING\x10\x01\x1a\x10\x8a\x9d \x0c\x42\x61tchSigning\x12\x35\n\x1f\x42\x41TCHED_COMMANDS_STATUS_ABORTED\x10\x02\x1a\x10\x8a\x9d \x0c\x42\x61tchAborted\x12\x33\n\x1e\x42\x41TCHED_COMMANDS_STATUS_SIGNED\x10\x03\x1a\x0f\x8a\x9d \x0b\x42\x61tchSigned\x1a\x04\x88\xa3\x1e\x00*y\n\x07SigType\x12\"\n\x14SIG_TYPE_UNSPECIFIED\x10\x00\x1a\x08\x8a\x9d \x04None\x12\x1a\n\x0bSIG_TYPE_TX\x10\x01\x1a\t\x8a\x9d \x05SigTx\x12$\n\x10SIG_TYPE_COMMAND\x10\x02\x1a\x0e\x8a\x9d \nSigCommand\x1a\x08\x88\xa3\x1e\x00\xa8\xa4\x1e\x01*\xc0\x01\n\rDepositStatus\x12(\n\x1a\x44\x45POSIT_STATUS_UNSPECIFIED\x10\x00\x1a\x08\x8a\x9d \x04None\x12\'\n\x16\x44\x45POSIT_STATUS_PENDING\x10\x01\x1a\x0b\x8a\x9d \x07Pending\x12+\n\x18\x44\x45POSIT_STATUS_CONFIRMED\x10\x02\x1a\r\x8a\x9d \tConfirmed\x12%\n\x15\x44\x45POSIT_STATUS_BURNED\x10\x03\x1a\n\x8a\x9d \x06\x42urned\x1a\x08\x88\xa3\x1e\x01\xa8\xa4\x1e\x01\x42\xc4\x01\n\x16\x63om.axelar.evm.v1beta1B\nTypesProtoP\x01Z0github.com/axelarnetwork/axelar-core/x/evm/types\xa2\x02\x03\x41\x45X\xaa\x02\x12\x41xelar.Evm.V1beta1\xca\x02\x12\x41xelar\\Evm\\V1beta1\xe2\x02\x1e\x41xelar\\Evm\\V1beta1\\GPBMetadata\xea\x02\x14\x41xelar::Evm::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.evm.v1beta1.types_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.axelar.evm.v1beta1B\nTypesProtoP\001Z0github.com/axelarnetwork/axelar-core/x/evm/types\242\002\003AEX\252\002\022Axelar.Evm.V1beta1\312\002\022Axelar\\Evm\\V1beta1\342\002\036Axelar\\Evm\\V1beta1\\GPBMetadata\352\002\024Axelar::Evm::V1beta1\310\341\036\000'
  _STATUS._options = None
  _STATUS._serialized_options = b'\210\243\036\000\250\244\036\001'
  _STATUS.values_by_name["STATUS_UNSPECIFIED"]._options = None
  _STATUS.values_by_name["STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \013NonExistent'
  _STATUS.values_by_name["STATUS_INITIALIZED"]._options = None
  _STATUS.values_by_name["STATUS_INITIALIZED"]._serialized_options = b'\212\235 \013Initialized'
  _STATUS.values_by_name["STATUS_PENDING"]._options = None
  _STATUS.values_by_name["STATUS_PENDING"]._serialized_options = b'\212\235 \007Pending'
  _STATUS.values_by_name["STATUS_CONFIRMED"]._options = None
  _STATUS.values_by_name["STATUS_CONFIRMED"]._serialized_options = b'\212\235 \tConfirmed'
  _COMMANDTYPE._options = None
  _COMMANDTYPE._serialized_options = b'\210\243\036\000\250\244\036\000'
  _BATCHEDCOMMANDSSTATUS._options = None
  _BATCHEDCOMMANDSSTATUS._serialized_options = b'\210\243\036\000'
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_UNSPECIFIED"]._options = None
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \020BatchNonExistent'
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_SIGNING"]._options = None
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_SIGNING"]._serialized_options = b'\212\235 \014BatchSigning'
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_ABORTED"]._options = None
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_ABORTED"]._serialized_options = b'\212\235 \014BatchAborted'
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_SIGNED"]._options = None
  _BATCHEDCOMMANDSSTATUS.values_by_name["BATCHED_COMMANDS_STATUS_SIGNED"]._serialized_options = b'\212\235 \013BatchSigned'
  _SIGTYPE._options = None
  _SIGTYPE._serialized_options = b'\210\243\036\000\250\244\036\001'
  _SIGTYPE.values_by_name["SIG_TYPE_UNSPECIFIED"]._options = None
  _SIGTYPE.values_by_name["SIG_TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \004None'
  _SIGTYPE.values_by_name["SIG_TYPE_TX"]._options = None
  _SIGTYPE.values_by_name["SIG_TYPE_TX"]._serialized_options = b'\212\235 \005SigTx'
  _SIGTYPE.values_by_name["SIG_TYPE_COMMAND"]._options = None
  _SIGTYPE.values_by_name["SIG_TYPE_COMMAND"]._serialized_options = b'\212\235 \nSigCommand'
  _DEPOSITSTATUS._options = None
  _DEPOSITSTATUS._serialized_options = b'\210\243\036\001\250\244\036\001'
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_UNSPECIFIED"]._options = None
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \004None'
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_PENDING"]._options = None
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_PENDING"]._serialized_options = b'\212\235 \007Pending'
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_CONFIRMED"]._options = None
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_CONFIRMED"]._serialized_options = b'\212\235 \tConfirmed'
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_BURNED"]._options = None
  _DEPOSITSTATUS.values_by_name["DEPOSIT_STATUS_BURNED"]._serialized_options = b'\212\235 \006Burned'
  _VOTEEVENTS.fields_by_name['chain']._options = None
  _VOTEEVENTS.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _VOTEEVENTS.fields_by_name['events']._options = None
  _VOTEEVENTS.fields_by_name['events']._serialized_options = b'\310\336\037\000'
  _EVENT_STATUS._options = None
  _EVENT_STATUS._serialized_options = b'\210\243\036\000\250\244\036\001'
  _EVENT_STATUS.values_by_name["STATUS_UNSPECIFIED"]._options = None
  _EVENT_STATUS.values_by_name["STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \020EventNonExistent'
  _EVENT_STATUS.values_by_name["STATUS_CONFIRMED"]._options = None
  _EVENT_STATUS.values_by_name["STATUS_CONFIRMED"]._serialized_options = b'\212\235 \016EventConfirmed'
  _EVENT_STATUS.values_by_name["STATUS_COMPLETED"]._options = None
  _EVENT_STATUS.values_by_name["STATUS_COMPLETED"]._serialized_options = b'\212\235 \016EventCompleted'
  _EVENT_STATUS.values_by_name["STATUS_FAILED"]._options = None
  _EVENT_STATUS.values_by_name["STATUS_FAILED"]._serialized_options = b'\212\235 \013EventFailed'
  _EVENT.fields_by_name['chain']._options = None
  _EVENT.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _EVENT.fields_by_name['tx_id']._options = None
  _EVENT.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _EVENT.fields_by_name['multisig_ownership_transferred']._options = None
  _EVENT.fields_by_name['multisig_ownership_transferred']._serialized_options = b'\030\001'
  _EVENTTOKENSENT.fields_by_name['sender']._options = None
  _EVENTTOKENSENT.fields_by_name['sender']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTTOKENSENT.fields_by_name['destination_chain']._options = None
  _EVENTTOKENSENT.fields_by_name['destination_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _EVENTTOKENSENT.fields_by_name['amount']._options = None
  _EVENTTOKENSENT.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _EVENTCONTRACTCALL.fields_by_name['sender']._options = None
  _EVENTCONTRACTCALL.fields_by_name['sender']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTCONTRACTCALL.fields_by_name['destination_chain']._options = None
  _EVENTCONTRACTCALL.fields_by_name['destination_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _EVENTCONTRACTCALL.fields_by_name['payload_hash']._options = None
  _EVENTCONTRACTCALL.fields_by_name['payload_hash']._serialized_options = b'\310\336\037\000\332\336\037\004Hash'
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['sender']._options = None
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['sender']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['destination_chain']._options = None
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['destination_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['payload_hash']._options = None
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['payload_hash']._serialized_options = b'\310\336\037\000\332\336\037\004Hash'
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['amount']._options = None
  _EVENTCONTRACTCALLWITHTOKEN.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _EVENTTRANSFER.fields_by_name['to']._options = None
  _EVENTTRANSFER.fields_by_name['to']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTTRANSFER.fields_by_name['amount']._options = None
  _EVENTTRANSFER.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _EVENTTOKENDEPLOYED.fields_by_name['token_address']._options = None
  _EVENTTOKENDEPLOYED.fields_by_name['token_address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['pre_owners']._options = None
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['pre_owners']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['prev_threshold']._options = None
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['prev_threshold']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['new_owners']._options = None
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['new_owners']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['new_threshold']._options = None
  _EVENTMULTISIGOWNERSHIPTRANSFERRED.fields_by_name['new_threshold']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _EVENTMULTISIGOWNERSHIPTRANSFERRED._options = None
  _EVENTMULTISIGOWNERSHIPTRANSFERRED._serialized_options = b'\030\001'
  _EVENTMULTISIGOPERATORSHIPTRANSFERRED.fields_by_name['new_operators']._options = None
  _EVENTMULTISIGOPERATORSHIPTRANSFERRED.fields_by_name['new_operators']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _EVENTMULTISIGOPERATORSHIPTRANSFERRED.fields_by_name['new_threshold']._options = None
  _EVENTMULTISIGOPERATORSHIPTRANSFERRED.fields_by_name['new_threshold']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _EVENTMULTISIGOPERATORSHIPTRANSFERRED.fields_by_name['new_weights']._options = None
  _EVENTMULTISIGOPERATORSHIPTRANSFERRED.fields_by_name['new_weights']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _NETWORKINFO.fields_by_name['id']._options = None
  _NETWORKINFO.fields_by_name['id']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _BURNERINFO.fields_by_name['burner_address']._options = None
  _BURNERINFO.fields_by_name['burner_address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _BURNERINFO.fields_by_name['token_address']._options = None
  _BURNERINFO.fields_by_name['token_address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _BURNERINFO.fields_by_name['destination_chain']._options = None
  _BURNERINFO.fields_by_name['destination_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _BURNERINFO.fields_by_name['salt']._options = None
  _BURNERINFO.fields_by_name['salt']._serialized_options = b'\310\336\037\000\332\336\037\004Hash'
  _ERC20DEPOSIT.fields_by_name['tx_id']._options = None
  _ERC20DEPOSIT.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _ERC20DEPOSIT.fields_by_name['amount']._options = None
  _ERC20DEPOSIT.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Uint'
  _ERC20DEPOSIT.fields_by_name['destination_chain']._options = None
  _ERC20DEPOSIT.fields_by_name['destination_chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _ERC20DEPOSIT.fields_by_name['burner_address']._options = None
  _ERC20DEPOSIT.fields_by_name['burner_address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _ERC20TOKENMETADATA.fields_by_name['chain_id']._options = None
  _ERC20TOKENMETADATA.fields_by_name['chain_id']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\342\336\037\007ChainID'
  _ERC20TOKENMETADATA.fields_by_name['details']._options = None
  _ERC20TOKENMETADATA.fields_by_name['details']._serialized_options = b'\310\336\037\000'
  _ERC20TOKENMETADATA.fields_by_name['token_address']._options = None
  _ERC20TOKENMETADATA.fields_by_name['token_address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _ERC20TOKENMETADATA.fields_by_name['tx_hash']._options = None
  _ERC20TOKENMETADATA.fields_by_name['tx_hash']._serialized_options = b'\310\336\037\000\332\336\037\004Hash'
  _TRANSACTIONMETADATA.fields_by_name['raw_tx']._options = None
  _TRANSACTIONMETADATA.fields_by_name['raw_tx']._serialized_options = b'\342\336\037\005RawTX'
  _COMMAND.fields_by_name['id']._options = None
  _COMMAND.fields_by_name['id']._serialized_options = b'\310\336\037\000\332\336\037\tCommandID\342\336\037\002ID'
  _COMMAND.fields_by_name['command']._options = None
  _COMMAND.fields_by_name['command']._serialized_options = b'\030\001'
  _COMMAND.fields_by_name['key_id']._options = None
  _COMMAND.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _COMMANDBATCHMETADATA.fields_by_name['id']._options = None
  _COMMANDBATCHMETADATA.fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _COMMANDBATCHMETADATA.fields_by_name['command_ids']._options = None
  _COMMANDBATCHMETADATA.fields_by_name['command_ids']._serialized_options = b'\310\336\037\000\332\336\037\tCommandID\342\336\037\nCommandIDs'
  _COMMANDBATCHMETADATA.fields_by_name['sig_hash']._options = None
  _COMMANDBATCHMETADATA.fields_by_name['sig_hash']._serialized_options = b'\310\336\037\000\332\336\037\004Hash'
  _COMMANDBATCHMETADATA.fields_by_name['key_id']._options = None
  _COMMANDBATCHMETADATA.fields_by_name['key_id']._serialized_options = b'\342\336\037\005KeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _COMMANDBATCHMETADATA.fields_by_name['prev_batched_commands_id']._options = None
  _COMMANDBATCHMETADATA.fields_by_name['prev_batched_commands_id']._serialized_options = b'\342\336\037\025PrevBatchedCommandsID'
  _COMMANDBATCHMETADATA.fields_by_name['signature']._options = None
  _COMMANDBATCHMETADATA.fields_by_name['signature']._serialized_options = b'\312\264-&github.com/cosmos/codec/ProtoMarshaler'
  _SIGMETADATA.fields_by_name['chain']._options = None
  _SIGMETADATA.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _SIGMETADATA.fields_by_name['command_batch_id']._options = None
  _SIGMETADATA.fields_by_name['command_batch_id']._serialized_options = b'\342\336\037\016CommandBatchID'
  _TRANSFERKEY.fields_by_name['tx_id']._options = None
  _TRANSFERKEY.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _TRANSFERKEY.fields_by_name['next_key_id']._options = None
  _TRANSFERKEY.fields_by_name['next_key_id']._serialized_options = b'\342\336\037\tNextKeyID\372\336\037>github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID'
  _ASSET.fields_by_name['chain']._options = None
  _ASSET.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _TOKENDETAILS.fields_by_name['decimals']._options = None
  _TOKENDETAILS.fields_by_name['decimals']._serialized_options = b'\372\336\037\005uint8'
  _TOKENDETAILS.fields_by_name['capacity']._options = None
  _TOKENDETAILS.fields_by_name['capacity']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _GATEWAY.fields_by_name['address']._options = None
  _GATEWAY.fields_by_name['address']._serialized_options = b'\310\336\037\000\332\336\037\007Address'
  _POLLMETADATA.fields_by_name['chain']._options = None
  _POLLMETADATA.fields_by_name['chain']._serialized_options = b'\372\336\037?github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName'
  _POLLMETADATA.fields_by_name['tx_id']._options = None
  _POLLMETADATA.fields_by_name['tx_id']._serialized_options = b'\310\336\037\000\332\336\037\004Hash\342\336\037\004TxID'
  _globals['_STATUS']._serialized_start=6257
  _globals['_STATUS']._serialized_end=6427
  _globals['_COMMANDTYPE']._serialized_start=6430
  _globals['_COMMANDTYPE']._serialized_end=6702
  _globals['_BATCHEDCOMMANDSSTATUS']._serialized_start=6705
  _globals['_BATCHEDCOMMANDSSTATUS']._serialized_end=6960
  _globals['_SIGTYPE']._serialized_start=6962
  _globals['_SIGTYPE']._serialized_end=7083
  _globals['_DEPOSITSTATUS']._serialized_start=7086
  _globals['_DEPOSITSTATUS']._serialized_end=7278
  _globals['_VOTEEVENTS']._serialized_start=220
  _globals['_VOTEEVENTS']._serialized_end=380
  _globals['_EVENT']._serialized_start=383
  _globals['_EVENT']._serialized_end=1481
  _globals['_EVENT_STATUS']._serialized_start=1276
  _globals['_EVENT_STATUS']._serialized_end=1460
  _globals['_EVENTTOKENSENT']._serialized_start=1484
  _globals['_EVENTTOKENSENT']._serialized_end=1801
  _globals['_EVENTCONTRACTCALL']._serialized_start=1804
  _globals['_EVENTCONTRACTCALL']._serialized_end=2070
  _globals['_EVENTCONTRACTCALLWITHTOKEN']._serialized_start=2073
  _globals['_EVENTCONTRACTCALLWITHTOKEN']._serialized_end=2445
  _globals['_EVENTTRANSFER']._serialized_start=2447
  _globals['_EVENTTRANSFER']._serialized_end=2568
  _globals['_EVENTTOKENDEPLOYED']._serialized_start=2570
  _globals['_EVENTTOKENDEPLOYED']._serialized_end=2668
  _globals['_EVENTMULTISIGOWNERSHIPTRANSFERRED']._serialized_start=2671
  _globals['_EVENTMULTISIGOWNERSHIPTRANSFERRED']._serialized_end=2980
  _globals['_EVENTMULTISIGOPERATORSHIPTRANSFERRED']._serialized_start=2983
  _globals['_EVENTMULTISIGOPERATORSHIPTRANSFERRED']._serialized_end=3255
  _globals['_NETWORKINFO']._serialized_start=3257
  _globals['_NETWORKINFO']._serialized_end=3354
  _globals['_BURNERINFO']._serialized_start=3357
  _globals['_BURNERINFO']._serialized_end=3673
  _globals['_ERC20DEPOSIT']._serialized_start=3676
  _globals['_ERC20DEPOSIT']._serialized_end=4027
  _globals['_ERC20TOKENMETADATA']._serialized_start=4030
  _globals['_ERC20TOKENMETADATA']._serialized_end=4441
  _globals['_TRANSACTIONMETADATA']._serialized_start=4443
  _globals['_TRANSACTIONMETADATA']._serialized_end=4523
  _globals['_COMMAND']._serialized_start=4526
  _globals['_COMMAND']._serialized_end=4817
  _globals['_COMMANDBATCHMETADATA']._serialized_start=4820
  _globals['_COMMANDBATCHMETADATA']._serialized_end=5340
  _globals['_SIGMETADATA']._serialized_start=5343
  _globals['_SIGMETADATA']._serialized_end=5558
  _globals['_TRANSFERKEY']._serialized_start=5561
  _globals['_TRANSFERKEY']._serialized_end=5736
  _globals['_ASSET']._serialized_start=5738
  _globals['_ASSET']._serialized_end=5856
  _globals['_TOKENDETAILS']._serialized_start=5859
  _globals['_TOKENDETAILS']._serialized_end=6043
  _globals['_GATEWAY']._serialized_start=6045
  _globals['_GATEWAY']._serialized_end=6103
  _globals['_POLLMETADATA']._serialized_start=6106
  _globals['_POLLMETADATA']._serialized_end=6254
# @@protoc_insertion_point(module_scope)