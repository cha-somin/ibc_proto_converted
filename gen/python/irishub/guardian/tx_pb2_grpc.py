# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from irishub.guardian import tx_pb2 as irishub_dot_guardian_dot_tx__pb2


class MsgStub(object):
    """Msg defines the guardian Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.AddSuper = channel.unary_unary(
                '/irishub.guardian.Msg/AddSuper',
                request_serializer=irishub_dot_guardian_dot_tx__pb2.MsgAddSuper.SerializeToString,
                response_deserializer=irishub_dot_guardian_dot_tx__pb2.MsgAddSuperResponse.FromString,
                )
        self.DeleteSuper = channel.unary_unary(
                '/irishub.guardian.Msg/DeleteSuper',
                request_serializer=irishub_dot_guardian_dot_tx__pb2.MsgDeleteSuper.SerializeToString,
                response_deserializer=irishub_dot_guardian_dot_tx__pb2.MsgDeleteSuperResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the guardian Msg service
    """

    def AddSuper(self, request, context):
        """AddSuper defines a method for adding a super account
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteSuper(self, request, context):
        """DeleteSuper defines a method for deleting a super account
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'AddSuper': grpc.unary_unary_rpc_method_handler(
                    servicer.AddSuper,
                    request_deserializer=irishub_dot_guardian_dot_tx__pb2.MsgAddSuper.FromString,
                    response_serializer=irishub_dot_guardian_dot_tx__pb2.MsgAddSuperResponse.SerializeToString,
            ),
            'DeleteSuper': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteSuper,
                    request_deserializer=irishub_dot_guardian_dot_tx__pb2.MsgDeleteSuper.FromString,
                    response_serializer=irishub_dot_guardian_dot_tx__pb2.MsgDeleteSuperResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'irishub.guardian.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the guardian Msg service
    """

    @staticmethod
    def AddSuper(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/irishub.guardian.Msg/AddSuper',
            irishub_dot_guardian_dot_tx__pb2.MsgAddSuper.SerializeToString,
            irishub_dot_guardian_dot_tx__pb2.MsgAddSuperResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteSuper(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/irishub.guardian.Msg/DeleteSuper',
            irishub_dot_guardian_dot_tx__pb2.MsgDeleteSuper.SerializeToString,
            irishub_dot_guardian_dot_tx__pb2.MsgDeleteSuperResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
