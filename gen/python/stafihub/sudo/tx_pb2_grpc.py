# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from stafihub.sudo import tx_pb2 as stafihub_dot_sudo_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.UpdateAdmin = channel.unary_unary(
                '/stafihub.stafihub.sudo.Msg/UpdateAdmin',
                request_serializer=stafihub_dot_sudo_dot_tx__pb2.MsgUpdateAdmin.SerializeToString,
                response_deserializer=stafihub_dot_sudo_dot_tx__pb2.MsgUpdateAdminResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def UpdateAdmin(self, request, context):
        """this line is used by starport scaffolding # proto/tx/rpc
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'UpdateAdmin': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateAdmin,
                    request_deserializer=stafihub_dot_sudo_dot_tx__pb2.MsgUpdateAdmin.FromString,
                    response_serializer=stafihub_dot_sudo_dot_tx__pb2.MsgUpdateAdminResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'stafihub.stafihub.sudo.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def UpdateAdmin(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/stafihub.stafihub.sudo.Msg/UpdateAdmin',
            stafihub_dot_sudo_dot_tx__pb2.MsgUpdateAdmin.SerializeToString,
            stafihub_dot_sudo_dot_tx__pb2.MsgUpdateAdminResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
