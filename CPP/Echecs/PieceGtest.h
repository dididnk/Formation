#include <gtest/gtest.h>
#include "Piece.h"

class PieceTest : public ::testing::Test
{
   protected:
    void SetUp() override
    {
        p.init( 1, 1, true );
    }

    void TearDown() override
    {

    }

    Piece p;
};

TEST_F( PieceTest, IsWhite )
{
    EXPECT_EQ( p.isWhite(), true );
}
