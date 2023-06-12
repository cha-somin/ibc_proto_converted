# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from kava.issuance.v1beta1 import tx_pb2 as kava_dot_issuance_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the issuance Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.IssueTokens = channel.unary_unary(
                '/kava.issuance.v1beta1.Msg/IssueTokens',
                request_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgIssueTokens.SerializeToString,
                response_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgIssueTokensResponse.FromString,
                )
        self.RedeemTokens = channel.unary_unary(
                '/kava.issuance.v1beta1.Msg/RedeemTokens',
                request_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgRedeemTokens.SerializeToString,
                response_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgRedeemTokensResponse.FromString,
                )
        self.BlockAddress = channel.unary_unary(
                '/kava.issuance.v1beta1.Msg/BlockAddress',
                request_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgBlockAddress.SerializeToString,
                response_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgBlockAddressResponse.FromString,
                )
        self.UnblockAddress = channel.unary_unary(
                '/kava.issuance.v1beta1.Msg/UnblockAddress',
                request_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgUnblockAddress.SerializeToString,
                response_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgUnblockAddressResponse.FromString,
                )
        self.SetPauseStatus = channel.unary_unary(
                '/kava.issuance.v1beta1.Msg/SetPauseStatus',
                request_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgSetPauseStatus.SerializeToString,
                response_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgSetPauseStatusResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the issuance Msg service.
    """

    def IssueTokens(self, request, context):
        """IssueTokens message type used by the issuer to issue new tokens
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def RedeemTokens(self, request, context):
        """RedeemTokens message type used by the issuer to redeem (burn) tokens
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def BlockAddress(self, request, context):
        """BlockAddress message type used by the issuer to block an address from holding or transferring tokens
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UnblockAddress(self, request, context):
        """UnblockAddress message type used by the issuer to unblock an address from holding or transferring tokens
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SetPauseStatus(self, request, context):
        """SetPauseStatus message type used to pause or unpause status
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'IssueTokens': grpc.unary_unary_rpc_method_handler(
                    servicer.IssueTokens,
                    request_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgIssueTokens.FromString,
                    response_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgIssueTokensResponse.SerializeToString,
            ),
            'RedeemTokens': grpc.unary_unary_rpc_method_handler(
                    servicer.RedeemTokens,
                    request_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgRedeemTokens.FromString,
                    response_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgRedeemTokensResponse.SerializeToString,
            ),
            'BlockAddress': grpc.unary_unary_rpc_method_handler(
                    servicer.BlockAddress,
                    request_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgBlockAddress.FromString,
                    response_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgBlockAddressResponse.SerializeToString,
            ),
            'UnblockAddress': grpc.unary_unary_rpc_method_handler(
                    servicer.UnblockAddress,
                    request_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgUnblockAddress.FromString,
                    response_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgUnblockAddressResponse.SerializeToString,
            ),
            'SetPauseStatus': grpc.unary_unary_rpc_method_handler(
                    servicer.SetPauseStatus,
                    request_deserializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgSetPauseStatus.FromString,
                    response_serializer=kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgSetPauseStatusResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'kava.issuance.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the issuance Msg service.
    """

    @staticmethod
    def IssueTokens(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.issuance.v1beta1.Msg/IssueTokens',
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgIssueTokens.SerializeToString,
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgIssueTokensResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def RedeemTokens(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.issuance.v1beta1.Msg/RedeemTokens',
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgRedeemTokens.SerializeToString,
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgRedeemTokensResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def BlockAddress(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.issuance.v1beta1.Msg/BlockAddress',
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgBlockAddress.SerializeToString,
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgBlockAddressResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UnblockAddress(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.issuance.v1beta1.Msg/UnblockAddress',
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgUnblockAddress.SerializeToString,
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgUnblockAddressResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SetPauseStatus(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/kava.issuance.v1beta1.Msg/SetPauseStatus',
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgSetPauseStatus.SerializeToString,
            kava_dot_issuance_dot_v1beta1_dot_tx__pb2.MsgSetPauseStatusResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
