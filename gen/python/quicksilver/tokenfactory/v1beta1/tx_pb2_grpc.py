# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from quicksilver.tokenfactory.v1beta1 import tx_pb2 as quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the tokefactory module's gRPC message service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateDenom = channel.unary_unary(
                '/quicksilver.tokenfactory.v1beta1.Msg/CreateDenom',
                request_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgCreateDenom.SerializeToString,
                response_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgCreateDenomResponse.FromString,
                )
        self.Mint = channel.unary_unary(
                '/quicksilver.tokenfactory.v1beta1.Msg/Mint',
                request_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgMint.SerializeToString,
                response_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgMintResponse.FromString,
                )
        self.Burn = channel.unary_unary(
                '/quicksilver.tokenfactory.v1beta1.Msg/Burn',
                request_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgBurn.SerializeToString,
                response_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgBurnResponse.FromString,
                )
        self.ChangeAdmin = channel.unary_unary(
                '/quicksilver.tokenfactory.v1beta1.Msg/ChangeAdmin',
                request_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgChangeAdmin.SerializeToString,
                response_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgChangeAdminResponse.FromString,
                )
        self.SetDenomMetadata = channel.unary_unary(
                '/quicksilver.tokenfactory.v1beta1.Msg/SetDenomMetadata',
                request_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgSetDenomMetadata.SerializeToString,
                response_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgSetDenomMetadataResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the tokefactory module's gRPC message service.
    """

    def CreateDenom(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Mint(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Burn(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ChangeAdmin(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetDenomMetadata(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateDenom': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateDenom,
                    request_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgCreateDenom.FromString,
                    response_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgCreateDenomResponse.SerializeToString,
            ),
            'Mint': grpc.unary_unary_rpc_method_handler(
                    servicer.Mint,
                    request_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgMint.FromString,
                    response_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgMintResponse.SerializeToString,
            ),
            'Burn': grpc.unary_unary_rpc_method_handler(
                    servicer.Burn,
                    request_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgBurn.FromString,
                    response_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgBurnResponse.SerializeToString,
            ),
            'ChangeAdmin': grpc.unary_unary_rpc_method_handler(
                    servicer.ChangeAdmin,
                    request_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgChangeAdmin.FromString,
                    response_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgChangeAdminResponse.SerializeToString,
            ),
            'SetDenomMetadata': grpc.unary_unary_rpc_method_handler(
                    servicer.SetDenomMetadata,
                    request_deserializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgSetDenomMetadata.FromString,
                    response_serializer=quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgSetDenomMetadataResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'quicksilver.tokenfactory.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the tokefactory module's gRPC message service.
    """

    @staticmethod
    def CreateDenom(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.tokenfactory.v1beta1.Msg/CreateDenom',
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgCreateDenom.SerializeToString,
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgCreateDenomResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Mint(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.tokenfactory.v1beta1.Msg/Mint',
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgMint.SerializeToString,
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgMintResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Burn(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.tokenfactory.v1beta1.Msg/Burn',
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgBurn.SerializeToString,
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgBurnResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ChangeAdmin(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.tokenfactory.v1beta1.Msg/ChangeAdmin',
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgChangeAdmin.SerializeToString,
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgChangeAdminResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetDenomMetadata(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/quicksilver.tokenfactory.v1beta1.Msg/SetDenomMetadata',
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgSetDenomMetadata.SerializeToString,
            quicksilver_dot_tokenfactory_dot_v1beta1_dot_tx__pb2.MsgSetDenomMetadataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
