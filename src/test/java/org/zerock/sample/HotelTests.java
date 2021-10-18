package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(
        locations = {"file:web/WEB-INF/applicationContext.xml"}
)
@Log4j
public class HotelTests {
    @Setter(onMethod_ = {@Autowired} )
    private SampleHotel hotel;

    @Test
    public void testExist(){
        assertNotNull(hotel);

        log.info(hotel);
        log.info("--------");
        log.info(hotel.getChef());
    }
}
