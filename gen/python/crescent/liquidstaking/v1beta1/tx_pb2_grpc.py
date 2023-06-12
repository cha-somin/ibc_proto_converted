# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from crescent.liquidstaking.v1beta1 import tx_pb2 as crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the liquid staking Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.LiquidStake = channel.unary_unary(
                '/crescent.liquidstaking.v1beta1.Msg/LiquidStake',
                request_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidStake.SerializeToString,
                response_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidStakeResponse.FromString,
                )
        self.LiquidUnstake = channel.unary_unary(
                '/crescent.liquidstaking.v1beta1.Msg/LiquidUnstake',
                request_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidUnstake.SerializeToString,
                response_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidUnstakeResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the liquid staking Msg service.
    """

    def LiquidStake(self, request, context):
        """LiquidStake defines a method for performing a delegation of coins
        from a delegator to whitelisted validators.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LiquidUnstake(self, request, context):
        """LiquidUnstake defines a method for performing an undelegation of liquid staking from a
        delegate.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'LiquidStake': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidStake,
                    request_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidStake.FromString,
                    response_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidStakeResponse.SerializeToString,
            ),
            'LiquidUnstake': grpc.unary_unary_rpc_method_handler(
                    servicer.LiquidUnstake,
                    request_deserializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidUnstake.FromString,
                    response_serializer=crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidUnstakeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'crescent.liquidstaking.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the liquid staking Msg service.
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
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidstaking.v1beta1.Msg/LiquidStake',
            crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidStake.SerializeToString,
            crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidStakeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LiquidUnstake(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/crescent.liquidstaking.v1beta1.Msg/LiquidUnstake',
            crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidUnstake.SerializeToString,
            crescent_dot_liquidstaking_dot_v1beta1_dot_tx__pb2.MsgLiquidUnstakeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
