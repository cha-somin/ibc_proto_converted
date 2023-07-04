# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from bitsong.fantoken.v1beta1 import tx_pb2 as bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the oracle Msg service
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Issue = channel.unary_unary(
                '/bitsong.fantoken.Msg/Issue',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgIssue.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgIssueResponse.FromString,
                )
        self.Mint = channel.unary_unary(
                '/bitsong.fantoken.Msg/Mint',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgMint.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgMintResponse.FromString,
                )
        self.Burn = channel.unary_unary(
                '/bitsong.fantoken.Msg/Burn',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgBurn.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgBurnResponse.FromString,
                )
        self.DisableMint = channel.unary_unary(
                '/bitsong.fantoken.Msg/DisableMint',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgDisableMint.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgDisableMintResponse.FromString,
                )
        self.SetMinter = channel.unary_unary(
                '/bitsong.fantoken.Msg/SetMinter',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetMinter.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetMinterResponse.FromString,
                )
        self.SetAuthority = channel.unary_unary(
                '/bitsong.fantoken.Msg/SetAuthority',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetAuthority.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetAuthorityResponse.FromString,
                )
        self.SetUri = channel.unary_unary(
                '/bitsong.fantoken.Msg/SetUri',
                request_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetUri.SerializeToString,
                response_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetUriResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the oracle Msg service
    """

    def Issue(self, request, context):
        """Issue defines a method for issuing a new fan token
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Mint(self, request, context):
        """Mint defines a method for minting some fan tokens
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Burn(self, request, context):
        """Burn defines a method for burning some fan tokens
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DisableMint(self, request, context):
        """DisableMint defines a method for disable the mint function
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetMinter(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetAuthority(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetUri(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Issue': grpc.unary_unary_rpc_method_handler(
                    servicer.Issue,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgIssue.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgIssueResponse.SerializeToString,
            ),
            'Mint': grpc.unary_unary_rpc_method_handler(
                    servicer.Mint,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgMint.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgMintResponse.SerializeToString,
            ),
            'Burn': grpc.unary_unary_rpc_method_handler(
                    servicer.Burn,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgBurn.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgBurnResponse.SerializeToString,
            ),
            'DisableMint': grpc.unary_unary_rpc_method_handler(
                    servicer.DisableMint,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgDisableMint.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgDisableMintResponse.SerializeToString,
            ),
            'SetMinter': grpc.unary_unary_rpc_method_handler(
                    servicer.SetMinter,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetMinter.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetMinterResponse.SerializeToString,
            ),
            'SetAuthority': grpc.unary_unary_rpc_method_handler(
                    servicer.SetAuthority,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetAuthority.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetAuthorityResponse.SerializeToString,
            ),
            'SetUri': grpc.unary_unary_rpc_method_handler(
                    servicer.SetUri,
                    request_deserializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetUri.FromString,
                    response_serializer=bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetUriResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'bitsong.fantoken.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the oracle Msg service
    """

    @staticmethod
    def Issue(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/Issue',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgIssue.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgIssueResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/Mint',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgMint.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgMintResponse.FromString,
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
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/Burn',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgBurn.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgBurnResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DisableMint(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/DisableMint',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgDisableMint.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgDisableMintResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetMinter(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/SetMinter',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetMinter.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetMinterResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetAuthority(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/SetAuthority',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetAuthority.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetAuthorityResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetUri(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/bitsong.fantoken.Msg/SetUri',
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetUri.SerializeToString,
            bitsong_dot_fantoken_dot_v1beta1_dot_tx__pb2.MsgSetUriResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)