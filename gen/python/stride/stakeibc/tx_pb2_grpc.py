# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stride.stakeibc import tx_pb2 as stride_dot_stakeibc_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.LiquidStake = channel.unary_unary(
                '/stride.stakeibc.Msg/LiquidStake',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgLiquidStake.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgLiquidStakeResponse.FromString,
                )
        self.RedeemStake = channel.unary_unary(
                '/stride.stakeibc.Msg/RedeemStake',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRedeemStake.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRedeemStakeResponse.FromString,
                )
        self.RegisterHostZone = channel.unary_unary(
                '/stride.stakeibc.Msg/RegisterHostZone',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRegisterHostZone.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRegisterHostZoneResponse.FromString,
                )
        self.ClaimUndelegatedTokens = channel.unary_unary(
                '/stride.stakeibc.Msg/ClaimUndelegatedTokens',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgClaimUndelegatedTokens.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgClaimUndelegatedTokensResponse.FromString,
                )
        self.RebalanceValidators = channel.unary_unary(
                '/stride.stakeibc.Msg/RebalanceValidators',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRebalanceValidators.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRebalanceValidatorsResponse.FromString,
                )
        self.AddValidators = channel.unary_unary(
                '/stride.stakeibc.Msg/AddValidators',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgAddValidators.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgAddValidatorsResponse.FromString,
                )
        self.ChangeValidatorWeight = channel.unary_unary(
                '/stride.stakeibc.Msg/ChangeValidatorWeight',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgChangeValidatorWeight.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgChangeValidatorWeightResponse.FromString,
                )
        self.DeleteValidator = channel.unary_unary(
                '/stride.stakeibc.Msg/DeleteValidator',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgDeleteValidator.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgDeleteValidatorResponse.FromString,
                )
        self.RestoreInterchainAccount = channel.unary_unary(
                '/stride.stakeibc.Msg/RestoreInterchainAccount',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRestoreInterchainAccount.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRestoreInterchainAccountResponse.FromString,
                )
        self.UpdateValidatorSharesExchRate = channel.unary_unary(
                '/stride.stakeibc.Msg/UpdateValidatorSharesExchRate',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgUpdateValidatorSharesExchRate.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgUpdateValidatorSharesExchRateResponse.FromString,
                )
        self.ClearBalance = channel.unary_unary(
                '/stride.stakeibc.Msg/ClearBalance',
                request_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgClearBalance.SerializeToString,
                response_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgClearBalanceResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def LiquidStake(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RedeemStake(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RegisterHostZone(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClaimUndelegatedTokens(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RebalanceValidators(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddValidators(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ChangeValidatorWeight(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteValidator(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RestoreInterchainAccount(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateValidatorSharesExchRate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClearBalance(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'LiquidStake': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidStake,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgLiquidStake.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgLiquidStakeResponse.SerializeToString,
            ),
            'RedeemStake': grpc.unary_unary_rpc_method_handler(
                    servicer.RedeemStake,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRedeemStake.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRedeemStakeResponse.SerializeToString,
            ),
            'RegisterHostZone': grpc.unary_unary_rpc_method_handler(
                    servicer.RegisterHostZone,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRegisterHostZone.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRegisterHostZoneResponse.SerializeToString,
            ),
            'ClaimUndelegatedTokens': grpc.unary_unary_rpc_method_handler(
                    servicer.ClaimUndelegatedTokens,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgClaimUndelegatedTokens.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgClaimUndelegatedTokensResponse.SerializeToString,
            ),
            'RebalanceValidators': grpc.unary_unary_rpc_method_handler(
                    servicer.RebalanceValidators,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRebalanceValidators.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRebalanceValidatorsResponse.SerializeToString,
            ),
            'AddValidators': grpc.unary_unary_rpc_method_handler(
                    servicer.AddValidators,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgAddValidators.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgAddValidatorsResponse.SerializeToString,
            ),
            'ChangeValidatorWeight': grpc.unary_unary_rpc_method_handler(
                    servicer.ChangeValidatorWeight,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgChangeValidatorWeight.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgChangeValidatorWeightResponse.SerializeToString,
            ),
            'DeleteValidator': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteValidator,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgDeleteValidator.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgDeleteValidatorResponse.SerializeToString,
            ),
            'RestoreInterchainAccount': grpc.unary_unary_rpc_method_handler(
                    servicer.RestoreInterchainAccount,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgRestoreInterchainAccount.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgRestoreInterchainAccountResponse.SerializeToString,
            ),
            'UpdateValidatorSharesExchRate': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateValidatorSharesExchRate,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgUpdateValidatorSharesExchRate.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgUpdateValidatorSharesExchRateResponse.SerializeToString,
            ),
            'ClearBalance': grpc.unary_unary_rpc_method_handler(
                    servicer.ClearBalance,
                    request_deserializer=stride_dot_stakeibc_dot_tx__pb2.MsgClearBalance.FromString,
                    response_serializer=stride_dot_stakeibc_dot_tx__pb2.MsgClearBalanceResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stride.stakeibc.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def LiquidStake(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/LiquidStake',
            stride_dot_stakeibc_dot_tx__pb2.MsgLiquidStake.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgLiquidStakeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RedeemStake(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/RedeemStake',
            stride_dot_stakeibc_dot_tx__pb2.MsgRedeemStake.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgRedeemStakeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RegisterHostZone(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/RegisterHostZone',
            stride_dot_stakeibc_dot_tx__pb2.MsgRegisterHostZone.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgRegisterHostZoneResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClaimUndelegatedTokens(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/ClaimUndelegatedTokens',
            stride_dot_stakeibc_dot_tx__pb2.MsgClaimUndelegatedTokens.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgClaimUndelegatedTokensResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RebalanceValidators(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/RebalanceValidators',
            stride_dot_stakeibc_dot_tx__pb2.MsgRebalanceValidators.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgRebalanceValidatorsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddValidators(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/AddValidators',
            stride_dot_stakeibc_dot_tx__pb2.MsgAddValidators.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgAddValidatorsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ChangeValidatorWeight(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/ChangeValidatorWeight',
            stride_dot_stakeibc_dot_tx__pb2.MsgChangeValidatorWeight.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgChangeValidatorWeightResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteValidator(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/DeleteValidator',
            stride_dot_stakeibc_dot_tx__pb2.MsgDeleteValidator.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgDeleteValidatorResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RestoreInterchainAccount(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/RestoreInterchainAccount',
            stride_dot_stakeibc_dot_tx__pb2.MsgRestoreInterchainAccount.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgRestoreInterchainAccountResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateValidatorSharesExchRate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/UpdateValidatorSharesExchRate',
            stride_dot_stakeibc_dot_tx__pb2.MsgUpdateValidatorSharesExchRate.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgUpdateValidatorSharesExchRateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClearBalance(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stride.stakeibc.Msg/ClearBalance',
            stride_dot_stakeibc_dot_tx__pb2.MsgClearBalance.SerializeToString,
            stride_dot_stakeibc_dot_tx__pb2.MsgClearBalanceResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
