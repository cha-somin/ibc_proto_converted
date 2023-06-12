# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from sentinel.provider.v2 import msg_pb2 as sentinel_dot_provider_dot_v2_dot_msg__pb2


class MsgServiceStub(object):
    """Missing associated documentation comment in .proto file."""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.MsgRegister = channel.unary_unary(
                '/sentinel.provider.v2.MsgService/MsgRegister',
                request_serializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgRegisterRequest.SerializeToString,
                response_deserializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgRegisterResponse.FromString,
                )
        self.MsgUpdate = channel.unary_unary(
                '/sentinel.provider.v2.MsgService/MsgUpdate',
                request_serializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgUpdateRequest.SerializeToString,
                response_deserializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgUpdateResponse.FromString,
                )


class MsgServiceServicer(object):
    """Missing associated documentation comment in .proto file."""

    def MsgRegister(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def MsgUpdate(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'MsgRegister': grpc.unary_unary_rpc_method_handler(
                    servicer.MsgRegister,
                    request_deserializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgRegisterRequest.FromString,
                    response_serializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgRegisterResponse.SerializeToString,
            ),
            'MsgUpdate': grpc.unary_unary_rpc_method_handler(
                    servicer.MsgUpdate,
                    request_deserializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgUpdateRequest.FromString,
                    response_serializer=sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgUpdateResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'sentinel.provider.v2.MsgService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class MsgService(object):
    """Missing associated documentation comment in .proto file."""

    @staticmethod
    def MsgRegister(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/sentinel.provider.v2.MsgService/MsgRegister',
            sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgRegisterRequest.SerializeToString,
            sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgRegisterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def MsgUpdate(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/sentinel.provider.v2.MsgService/MsgUpdate',
            sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgUpdateRequest.SerializeToString,
            sentinel_dot_provider_dot_v2_dot_msg__pb2.MsgUpdateResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
