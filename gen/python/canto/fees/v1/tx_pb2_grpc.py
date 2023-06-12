# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from canto.fees.v1 import tx_pb2 as canto_dot_fees_dot_v1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the fees Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.RegisterFee = channel.unary_unary(
                '/canto.fees.v1.Msg/RegisterFee',
                request_serializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgRegisterFee.SerializeToString,
                response_deserializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgRegisterFeeResponse.FromString,
                )
        self.CancelFee = channel.unary_unary(
                '/canto.fees.v1.Msg/CancelFee',
                request_serializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgCancelFee.SerializeToString,
                response_deserializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgCancelFeeResponse.FromString,
                )
        self.UpdateFee = channel.unary_unary(
                '/canto.fees.v1.Msg/UpdateFee',
                request_serializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgUpdateFee.SerializeToString,
                response_deserializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgUpdateFeeResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the fees Msg service.
    """

    def RegisterFee(self, request, context):
        """RegisterFee registers a new contract for receiving transaction fees
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CancelFee(self, request, context):
        """CancelFee cancels a contract's fee registration and further receival of
        transaction fees
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateFee(self, request, context):
        """UpdateFee updates the withdraw address
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'RegisterFee': grpc.unary_unary_rpc_method_handler(
                    servicer.RegisterFee,
                    request_deserializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgRegisterFee.FromString,
                    response_serializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgRegisterFeeResponse.SerializeToString,
            ),
            'CancelFee': grpc.unary_unary_rpc_method_handler(
                    servicer.CancelFee,
                    request_deserializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgCancelFee.FromString,
                    response_serializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgCancelFeeResponse.SerializeToString,
            ),
            'UpdateFee': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateFee,
                    request_deserializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgUpdateFee.FromString,
                    response_serializer=canto_dot_fees_dot_v1_dot_tx__pb2.MsgUpdateFeeResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'canto.fees.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the fees Msg service.
    """

    @staticmethod
    def RegisterFee(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/canto.fees.v1.Msg/RegisterFee',
            canto_dot_fees_dot_v1_dot_tx__pb2.MsgRegisterFee.SerializeToString,
            canto_dot_fees_dot_v1_dot_tx__pb2.MsgRegisterFeeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CancelFee(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/canto.fees.v1.Msg/CancelFee',
            canto_dot_fees_dot_v1_dot_tx__pb2.MsgCancelFee.SerializeToString,
            canto_dot_fees_dot_v1_dot_tx__pb2.MsgCancelFeeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateFee(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/canto.fees.v1.Msg/UpdateFee',
            canto_dot_fees_dot_v1_dot_tx__pb2.MsgUpdateFee.SerializeToString,
            canto_dot_fees_dot_v1_dot_tx__pb2.MsgUpdateFeeResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
