# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from panacea.oracle.v2alpha2 import query_pb2 as panacea_dot_oracle_dot_v2alpha2_dot_query__pb2


class QueryStub(object):
    """Query defines the gRPC querier service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.Oracles = channel.unary_unary(
                '/panacea.oracle.v2alpha2.Query/Oracles',
                request_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOraclesRequest.SerializeToString,
                response_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOraclesResponse.FromString,
                )
        self.Oracle = channel.unary_unary(
                '/panacea.oracle.v2alpha2.Query/Oracle',
                request_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRequest.SerializeToString,
                response_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleResponse.FromString,
                )
        self.OracleRegistration = channel.unary_unary(
                '/panacea.oracle.v2alpha2.Query/OracleRegistration',
                request_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationRequest.SerializeToString,
                response_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationResponse.FromString,
                )
        self.OracleRegistrationVote = channel.unary_unary(
                '/panacea.oracle.v2alpha2.Query/OracleRegistrationVote',
                request_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationVoteRequest.SerializeToString,
                response_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationVoteResponse.FromString,
                )
        self.Params = channel.unary_unary(
                '/panacea.oracle.v2alpha2.Query/Params',
                request_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleParamsRequest.SerializeToString,
                response_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryParamsResponse.FromString,
                )
        self.OracleUpgradeInfo = channel.unary_unary(
                '/panacea.oracle.v2alpha2.Query/OracleUpgradeInfo',
                request_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleUpgradeInfoRequest.SerializeToString,
                response_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleUpgradeInfoResponse.FromString,
                )


class QueryServicer(object):
    """Query defines the gRPC querier service.
    """

    def Oracles(self, request, context):
        """Oracles returns a list of oracles.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Oracle(self, request, context):
        """Oracle returns a oracle.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def OracleRegistration(self, request, context):
        """OracleRegistration returns a OracleRegistration details.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def OracleRegistrationVote(self, request, context):
        """OracleRegistrationVote a OracleRegistrationVote details.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Params(self, request, context):
        """Params returns params of oracle module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def OracleUpgradeInfo(self, request, context):
        """OracleUpgradeInfo returns OracleUpgradeInfo of oracle module.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_QueryServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'Oracles': grpc.unary_unary_rpc_method_handler(
                    servicer.Oracles,
                    request_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOraclesRequest.FromString,
                    response_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOraclesResponse.SerializeToString,
            ),
            'Oracle': grpc.unary_unary_rpc_method_handler(
                    servicer.Oracle,
                    request_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRequest.FromString,
                    response_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleResponse.SerializeToString,
            ),
            'OracleRegistration': grpc.unary_unary_rpc_method_handler(
                    servicer.OracleRegistration,
                    request_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationRequest.FromString,
                    response_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationResponse.SerializeToString,
            ),
            'OracleRegistrationVote': grpc.unary_unary_rpc_method_handler(
                    servicer.OracleRegistrationVote,
                    request_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationVoteRequest.FromString,
                    response_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationVoteResponse.SerializeToString,
            ),
            'Params': grpc.unary_unary_rpc_method_handler(
                    servicer.Params,
                    request_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleParamsRequest.FromString,
                    response_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryParamsResponse.SerializeToString,
            ),
            'OracleUpgradeInfo': grpc.unary_unary_rpc_method_handler(
                    servicer.OracleUpgradeInfo,
                    request_deserializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleUpgradeInfoRequest.FromString,
                    response_serializer=panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleUpgradeInfoResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'panacea.oracle.v2alpha2.Query', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Query(object):
    """Query defines the gRPC querier service.
    """

    @staticmethod
    def Oracles(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.oracle.v2alpha2.Query/Oracles',
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOraclesRequest.SerializeToString,
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOraclesResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Oracle(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.oracle.v2alpha2.Query/Oracle',
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRequest.SerializeToString,
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def OracleRegistration(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.oracle.v2alpha2.Query/OracleRegistration',
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationRequest.SerializeToString,
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def OracleRegistrationVote(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.oracle.v2alpha2.Query/OracleRegistrationVote',
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationVoteRequest.SerializeToString,
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleRegistrationVoteResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Params(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.oracle.v2alpha2.Query/Params',
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleParamsRequest.SerializeToString,
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryParamsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def OracleUpgradeInfo(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/panacea.oracle.v2alpha2.Query/OracleUpgradeInfo',
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleUpgradeInfoRequest.SerializeToString,
            panacea_dot_oracle_dot_v2alpha2_dot_query__pb2.QueryOracleUpgradeInfoResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
