# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from ixo.claims.v1beta1 import tx_pb2 as ixo_dot_claims_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg defines the Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateCollection = channel.unary_unary(
                '/ixo.claims.v1beta1.Msg/CreateCollection',
                request_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgCreateCollection.SerializeToString,
                response_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgCreateCollectionResponse.FromString,
                )
        self.SubmitClaim = channel.unary_unary(
                '/ixo.claims.v1beta1.Msg/SubmitClaim',
                request_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgSubmitClaim.SerializeToString,
                response_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgSubmitClaimResponse.FromString,
                )
        self.EvaluateClaim = channel.unary_unary(
                '/ixo.claims.v1beta1.Msg/EvaluateClaim',
                request_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgEvaluateClaim.SerializeToString,
                response_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgEvaluateClaimResponse.FromString,
                )
        self.DisputeClaim = channel.unary_unary(
                '/ixo.claims.v1beta1.Msg/DisputeClaim',
                request_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgDisputeClaim.SerializeToString,
                response_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgDisputeClaimResponse.FromString,
                )
        self.WithdrawPayment = channel.unary_unary(
                '/ixo.claims.v1beta1.Msg/WithdrawPayment',
                request_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgWithdrawPayment.SerializeToString,
                response_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgWithdrawPaymentResponse.FromString,
                )


class MsgServicer(object):
    """Msg defines the Msg service.
    """

    def CreateCollection(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def SubmitClaim(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def EvaluateClaim(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DisputeClaim(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def WithdrawPayment(self, request, context):
        """Missing associated documentation comment in .proto file."""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateCollection': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateCollection,
                    request_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgCreateCollection.FromString,
                    response_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgCreateCollectionResponse.SerializeToString,
            ),
            'SubmitClaim': grpc.unary_unary_rpc_method_handler(
                    servicer.SubmitClaim,
                    request_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgSubmitClaim.FromString,
                    response_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgSubmitClaimResponse.SerializeToString,
            ),
            'EvaluateClaim': grpc.unary_unary_rpc_method_handler(
                    servicer.EvaluateClaim,
                    request_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgEvaluateClaim.FromString,
                    response_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgEvaluateClaimResponse.SerializeToString,
            ),
            'DisputeClaim': grpc.unary_unary_rpc_method_handler(
                    servicer.DisputeClaim,
                    request_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgDisputeClaim.FromString,
                    response_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgDisputeClaimResponse.SerializeToString,
            ),
            'WithdrawPayment': grpc.unary_unary_rpc_method_handler(
                    servicer.WithdrawPayment,
                    request_deserializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgWithdrawPayment.FromString,
                    response_serializer=ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgWithdrawPaymentResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'ixo.claims.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg defines the Msg service.
    """

    @staticmethod
    def CreateCollection(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.claims.v1beta1.Msg/CreateCollection',
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgCreateCollection.SerializeToString,
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgCreateCollectionResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def SubmitClaim(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.claims.v1beta1.Msg/SubmitClaim',
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgSubmitClaim.SerializeToString,
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgSubmitClaimResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def EvaluateClaim(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.claims.v1beta1.Msg/EvaluateClaim',
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgEvaluateClaim.SerializeToString,
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgEvaluateClaimResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DisputeClaim(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.claims.v1beta1.Msg/DisputeClaim',
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgDisputeClaim.SerializeToString,
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgDisputeClaimResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def WithdrawPayment(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/ixo.claims.v1beta1.Msg/WithdrawPayment',
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgWithdrawPayment.SerializeToString,
            ixo_dot_claims_dot_v1beta1_dot_tx__pb2.MsgWithdrawPaymentResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
