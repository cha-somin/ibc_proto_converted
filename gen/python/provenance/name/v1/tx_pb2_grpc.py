# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from provenance.name.v1 import tx_pb2 as provenance_dot_name_dot_v1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the bank Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.BindName = channel.unary_unary(
                '/provenance.name.v1.Msg/BindName',
                request_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgBindNameRequest.SerializeToString,
                response_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgBindNameResponse.FromString,
                )
        self.DeleteName = channel.unary_unary(
                '/provenance.name.v1.Msg/DeleteName',
                request_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgDeleteNameRequest.SerializeToString,
                response_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgDeleteNameResponse.FromString,
                )
        self.ModifyName = channel.unary_unary(
                '/provenance.name.v1.Msg/ModifyName',
                request_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgModifyNameRequest.SerializeToString,
                response_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgModifyNameResponse.FromString,
                )
        self.CreateRootName = channel.unary_unary(
                '/provenance.name.v1.Msg/CreateRootName',
                request_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgCreateRootNameRequest.SerializeToString,
                response_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgCreateRootNameResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the bank Msg service.
    """

    def BindName(self, request, context):
        """BindName binds a name to an address under a root name.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DeleteName(self, request, context):
        """DeleteName defines a method to verify a particular invariance.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ModifyName(self, request, context):
        """ModifyName defines a method to modify the attributes of an existing name.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateRootName(self, request, context):
        """CreateRootName defines a governance method for creating a root name.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'BindName': grpc.unary_unary_rpc_method_handler(
                    servicer.BindName,
                    request_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgBindNameRequest.FromString,
                    response_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgBindNameResponse.SerializeToString,
            ),
            'DeleteName': grpc.unary_unary_rpc_method_handler(
                    servicer.DeleteName,
                    request_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgDeleteNameRequest.FromString,
                    response_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgDeleteNameResponse.SerializeToString,
            ),
            'ModifyName': grpc.unary_unary_rpc_method_handler(
                    servicer.ModifyName,
                    request_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgModifyNameRequest.FromString,
                    response_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgModifyNameResponse.SerializeToString,
            ),
            'CreateRootName': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateRootName,
                    request_deserializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgCreateRootNameRequest.FromString,
                    response_serializer=provenance_dot_name_dot_v1_dot_tx__pb2.MsgCreateRootNameResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'provenance.name.v1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the bank Msg service.
    """

    @staticmethod
    def BindName(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.name.v1.Msg/BindName',
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgBindNameRequest.SerializeToString,
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgBindNameResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DeleteName(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.name.v1.Msg/DeleteName',
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgDeleteNameRequest.SerializeToString,
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgDeleteNameResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ModifyName(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.name.v1.Msg/ModifyName',
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgModifyNameRequest.SerializeToString,
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgModifyNameResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateRootName(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/provenance.name.v1.Msg/CreateRootName',
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgCreateRootNameRequest.SerializeToString,
            provenance_dot_name_dot_v1_dot_tx__pb2.MsgCreateRootNameResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
